/*
 * DisplayInterface.java
 *
 * Created on September 18, 2007, 3:03 PM
 *
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

public interface DisplayInterface {
 
    public void select(Displays display);
    public void unselect(Displays display);
    public void updateGraph(float[] samples);
    public void setSampleRate(int sampleRate);
    public void setDisplayCalibrationOffset(double displayCalibrationOffset);
    public void setFilterSizeOffset(int offset);
    public void setPreampOffset(double preampOffset);
    public void setFilter(int low,int high);
    public void setFrequency(double frequency);
 
}
