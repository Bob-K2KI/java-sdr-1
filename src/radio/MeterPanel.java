/*
 * MeterPanel.java
 *
 * Created on September 28, 2007, 4:55 PM
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

public class MeterPanel extends javax.swing.JPanel {
    
    /** Creates new form MeterPanel */
    public MeterPanel() {
        initComponents();
    }
    
    public void setText(String text) {
        this.text=text;
    }
    
    protected void paintComponent(java.awt.Graphics g) {
        g.setColor(java.awt.Color.BLACK);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(java.awt.Color.RED);        
        g.fillRect(0,0,x,this.getHeight());
        g.setColor(java.awt.Color.YELLOW);
        g.drawLine(max,0,max,this.getHeight());
        g.setColor(java.awt.Color.WHITE);
        if(text!=null) {
            g.drawString(text,3,18);
        }
    }
    
    public void setSample(double num) {
        //System.err.println(sample);
        this.sample=num;
        
        int width=this.getWidth();
        //System.err.println("MeterPanel: width="+width);
        /*
        if(num <= -97.0f)
            x = (int)(0+(num+100.0)/3.0*10);
        else if(num <= -91.0f)
            x = (int)(10+(num+97.0)/6.0*17);
        else if(num <= -85.0f)
            x = (int)(20+(num+91.0)/6.0*16);
        else if(num <= -79.0f)
            x = (int)(30+(num+85.0)/6.0*17);
        else if(num <= -73.0f)
            x = (int)(40+(num+79.0)/6.0*16);
        else if(num <= -53.0f)
            x = (int)(50+(num+73.0)/20.0*24);
        else if(num <= -33.0f)
            x = (int)(60+(num+53.0)/20.0*24);
        else if(num <= -13.0f)
            x = (int)(70+(num+33.0)/20.0*24);
        else
            x = (int)(80 + (num+13.0)/20.0*19);
        
        x = (int)num + 100;
        */
        
        // convert dbm to S units
        x=0;
        int s=0;
        if(num>=-121.0) s=1;
        if(num>=-115.0) s=2;
        if(num>=-109.0) s=3;
        if(num>=-103.0) s=4;
        if(num>=-97.0) s=5;
        if(num>=-91.0) s=6;
        if(num>=-85.0) s=7;
        if(num>=-79.0) s=8;
        if(num>=-73.0) s=9;
        if(num>=-63.0) s=10; // 9+10
        if(num>=-53.0) s=11; // 9+20
        if(num>=-43.0) s=12; // 9+30
        if(num>=-33.0) s=13; // 9+40
        if(num>=-23.0) s=14; // 9+50
        if(num>=-13.0) s=15; // 9+60
        
        x=s*(width/15);
        
        count++;
        if(count==10) {
            max=x;
            count=0;
        } else if(x>max) {
            max=x;
        }
        //System.err.println("num="+num+" m="+x+" w="+this.getWidth());

        this.repaint(new java.awt.Rectangle(getWidth(),getHeight()));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setFont(new java.awt.Font("Dialog", 0, 10));
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    private String text;
    private double sample;
    private int x;
    private int max=0;
    private int count=0;
}
