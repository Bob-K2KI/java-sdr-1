/*
 * MeterUpdateThread.java
 *
 * Created on September 28, 2007, 11:28 AM
 *
 * Copyright (C) 2006, 2007 by John Melton, G0ORX/N6LYT
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * The author can be reached by email at
 *
 * john.melton@sun.com
 *
 */

package radio;

public class MeterUpdateThread extends Thread {

    private boolean terminate=false;
    private int displayFrequency;
    private DttSP dttsp;
    private String meterUpdateCommand;
    private int id;
    
    MeterUpdateThread(int displayFrequency,DttSP dttsp,String meterUpdateCommand,int id) {
        System.err.println("MeterUpdateThread");
        this.displayFrequency=displayFrequency;
        this.dttsp=dttsp;
        this.meterUpdateCommand=meterUpdateCommand;
        this.id=id;
    }

    public void run() {
        System.err.println("MeterUpdateThread.run");
        while(!terminate) {
            try {
                this.sleep(1000/displayFrequency);
                if(!terminate) {
                    dttsp.sendCommand(meterUpdateCommand+" "+id);
                }
            } catch(Exception e) {
            }
        }
        System.err.println("MeterUpdateThread.run: terminated");
    }

    public void terminate() {
        this.terminate=true;
    }
}
