package radio;

import java.awt.Color;
import java.text.DecimalFormat;

/*
 * VFO.java
 *
 * Created on September 10, 2007, 5:18 PM
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

/**
 * 
 *  VFO
 */
public class VFO extends javax.swing.JPanel implements VFOInterface {
    
    /**
     * Creates new form VFO
     */
    public VFO() {
        initComponents();
    }
    
    public void addListener(VFOListener vfoListener) {
        this.vfoListener=vfoListener;
    }
    
    // VFOInterface
    public void setAFrequency(double frequency) {
        aFrequency=frequency;
        vfoAFrequency.setText(frequencyFormat.format(aFrequency));
    }
    
    public void setAText(String text) {
        vfoAText.setText(text);
    }
    
    public void setATransmit(boolean state) {
        if(state) {
            vfoAFrequency.setForeground(Radio.transmitColor);
        } else {
            vfoAFrequency.setForeground(Radio.receiveColor);
        }
    }
    
    public void setBFrequency(double frequency) {
        bFrequency=frequency;
        vfoBFrequency.setText(frequencyFormat.format(bFrequency));
    }
    
    public void setBText(String text) {
        vfoBText.setText(text);
    }
    
    public void setBTransmit(boolean state) {
        if(state) {
            vfoBFrequency.setForeground(Radio.transmitColor);
            vfoBText.setForeground(Radio.transmitColor);
            vfoBLabel.setForeground(Radio.transmitColor);
        } else {
            vfoBFrequency.setForeground(Radio.disabledColor);
            vfoBText.setForeground(Radio.disabledColor);
            vfoBLabel.setForeground(Radio.disabledColor);
        }
    }
    
    public void setStep(double step) {
        this.step=step;
        if(step==0.000001) {
            stepComboBox.setSelectedIndex(0);
        } else if(step==0.000010) {
            stepComboBox.setSelectedIndex(1);
        } else if(step==0.000100) {
            stepComboBox.setSelectedIndex(2);
        } else if(step==0.001000) {
            stepComboBox.setSelectedIndex(3);
        } else if(step==0.010000) {
            stepComboBox.setSelectedIndex(4);
        } else if(step==0.100000) {
            stepComboBox.setSelectedIndex(5);
        } else if(step==1.000000) {
            stepComboBox.setSelectedIndex(6);
        } else if(step==10.000000) {
            stepComboBox.setSelectedIndex(7);
        }
            
    }
    
    void stepFrequency(double increment) {
        setAFrequency(aFrequency+increment);
        vfoListener.setAFrequency(aFrequency);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vfoALabel = new javax.swing.JLabel();
        vfoAText = new javax.swing.JTextField();
        vfoAFrequency = new javax.swing.JTextField();
        aToB = new javax.swing.JButton();
        bToA = new javax.swing.JButton();
        aSwapB = new javax.swing.JButton();
        split = new javax.swing.JButton();
        vfoBLabel = new javax.swing.JLabel();
        vfoBText = new javax.swing.JTextField();
        vfoBFrequency = new javax.swing.JTextField();
        stepComboBox = new javax.swing.JComboBox();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vfoALabel.setForeground(new java.awt.Color(0, 102, 0));
        vfoALabel.setText("VFO A");
        add(vfoALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        vfoAText.setBackground(new java.awt.Color(153, 153, 153));
        vfoAText.setForeground(new java.awt.Color(0, 102, 0));
        vfoAText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        vfoAText.setText("jTextField1");
        vfoAText.setBorder(null);
        add(vfoAText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 330, -1));

        vfoAFrequency.setBackground(new java.awt.Color(102, 102, 102));
        vfoAFrequency.setEditable(false);
        vfoAFrequency.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        vfoAFrequency.setForeground(new java.awt.Color(0, 204, 0));
        vfoAFrequency.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        vfoAFrequency.setText("2400.000000");
        vfoAFrequency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vfoAFrequency.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                vfoAFrequencyMouseWheelMoved(evt);
            }
        });
        add(vfoAFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 50));

        aToB.setBackground(new java.awt.Color(153, 153, 153));
        aToB.setText("A>B");
        aToB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aToB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aToBActionPerformed(evt);
            }
        });
        add(aToB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 70, -1));

        bToA.setBackground(new java.awt.Color(153, 153, 153));
        bToA.setText("A<B");
        bToA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bToA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToAActionPerformed(evt);
            }
        });
        add(bToA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 70, -1));

        aSwapB.setBackground(new java.awt.Color(153, 153, 153));
        aSwapB.setText("A<>B");
        aSwapB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aSwapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSwapBActionPerformed(evt);
            }
        });
        add(aSwapB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 70, -1));

        split.setBackground(new java.awt.Color(153, 153, 153));
        split.setText("SPLIT");
        split.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(split, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 70, -1));

        vfoBLabel.setForeground(new java.awt.Color(0, 102, 0));
        vfoBLabel.setText("VFO B");
        add(vfoBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        vfoBText.setBackground(new java.awt.Color(153, 153, 153));
        vfoBText.setEditable(false);
        vfoBText.setForeground(new java.awt.Color(0, 102, 51));
        vfoBText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        vfoBText.setText("jTextField1");
        vfoBText.setBorder(null);
        add(vfoBText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 320, -1));

        vfoBFrequency.setBackground(new java.awt.Color(102, 102, 102));
        vfoBFrequency.setEditable(false);
        vfoBFrequency.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        vfoBFrequency.setForeground(new java.awt.Color(0, 204, 0));
        vfoBFrequency.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        vfoBFrequency.setText("2400.000000");
        vfoBFrequency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(vfoBFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 270, 50));

        stepComboBox.setBackground(new java.awt.Color(153, 153, 153));
        stepComboBox.setForeground(new java.awt.Color(0, 102, 0));
        stepComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Hz", "10 Hz", "100 Hz", "1 KHz", "10 KHz", "100 KHz", "1 MHz", "10 MHz" }));
        stepComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stepComboBox.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                stepComboBoxMouseWheelMoved(evt);
            }
        });
        stepComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stepComboBoxItemStateChanged(evt);
            }
        });
        add(stepComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 65, 100, -1));

        upButton.setBackground(new java.awt.Color(153, 153, 153));
        upButton.setText("Up");
        upButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        upButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        upButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upButtonMouseReleased(evt);
            }
        });
        add(upButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, -1));

        downButton.setBackground(new java.awt.Color(153, 153, 153));
        downButton.setText("Dn");
        downButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        downButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        downButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                downButtonMouseReleased(evt);
            }
        });
        add(downButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 40, -1));

        jLabel1.setText("Step");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void vfoAFrequencyMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_vfoAFrequencyMouseWheelMoved
        vfoListener.incrementFrequency(evt.getWheelRotation());
    }//GEN-LAST:event_vfoAFrequencyMouseWheelMoved

    private void stepComboBoxMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_stepComboBoxMouseWheelMoved
        int current=stepComboBox.getSelectedIndex();
        if(evt.getWheelRotation()<0) {
            if(current==0) {
                current=7;
            } else {
                current--;
            }
        } else {
            if(current==7) {
                current=0;
            } else {
                current++;
            }
        }
        stepComboBox.setSelectedIndex(current);
    }//GEN-LAST:event_stepComboBoxMouseWheelMoved

    private void stepComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stepComboBoxItemStateChanged
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED) {
            switch(stepComboBox.getSelectedIndex()) {
                case 0:
                    step=0.000001;
                    break;
                case 1:
                    step=0.000010;
                    break;
                case 2:
                    step=0.000100;
                    break;
                case 3:
                    step=0.001000;
                    break;
                case 4:
                    step=0.010000;
                    break;
                case 5:
                    step=0.100000;
                    break;
                case 6:
                    step=1.000000;
                    break;
                case 7:
                    step=10.000000;
                    break;
            }
        }
        vfoListener.stepSelected(step);
    }//GEN-LAST:event_stepComboBoxItemStateChanged

    private void downButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downButtonMouseReleased
        buttonRepeatThread.terminate();
    }//GEN-LAST:event_downButtonMouseReleased

    private void downButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downButtonMousePressed
        buttonRepeatThread=new ButtonRepeatThread(-step);
        buttonRepeatThread.start();
    }//GEN-LAST:event_downButtonMousePressed

    private void upButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upButtonMouseReleased
        buttonRepeatThread.terminate();
    }//GEN-LAST:event_upButtonMouseReleased

    private void upButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upButtonMousePressed
        buttonRepeatThread=new ButtonRepeatThread(step);
        buttonRepeatThread.start();
    }//GEN-LAST:event_upButtonMousePressed

    private void aSwapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSwapBActionPerformed
        double tempFrequency=aFrequency;
        String tempVfoFrequency=vfoAFrequency.getText();
        String tempVfoText=vfoAText.getText();
        aFrequency=bFrequency;
        vfoAFrequency.setText(vfoBFrequency.getText());
        vfoAText.setText(vfoBText.getText());
        bFrequency=tempFrequency;
        vfoBFrequency.setText(tempVfoFrequency);
        vfoBText.setText(tempVfoText);
        // vfoListener to let radio know
        vfoListener.setAFrequency(aFrequency);
        vfoListener.setBFrequency(bFrequency);
    }//GEN-LAST:event_aSwapBActionPerformed

    private void bToAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToAActionPerformed
        aFrequency=bFrequency;
        vfoAFrequency.setText(vfoBFrequency.getText());
        vfoAText.setText(vfoBText.getText());
        // vfoListener to let radio know
        vfoListener.setAFrequency(aFrequency);
    }//GEN-LAST:event_bToAActionPerformed

    private void aToBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aToBActionPerformed
        bFrequency=aFrequency;
        vfoBFrequency.setText(vfoAFrequency.getText());
        vfoBText.setText(vfoAText.getText());
        // vfoListener to let radio know
        vfoListener.setBFrequency(bFrequency);
    }//GEN-LAST:event_aToBActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aSwapB;
    private javax.swing.JButton aToB;
    private javax.swing.JButton bToA;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton split;
    private javax.swing.JComboBox stepComboBox;
    private javax.swing.JButton upButton;
    private javax.swing.JTextField vfoAFrequency;
    private javax.swing.JLabel vfoALabel;
    private javax.swing.JTextField vfoAText;
    private javax.swing.JTextField vfoBFrequency;
    private javax.swing.JLabel vfoBLabel;
    private javax.swing.JTextField vfoBText;
    // End of variables declaration//GEN-END:variables
    
    private VFOListener vfoListener;
    
    private double aFrequency;
    private double bFrequency;
    private double step=0.000100;
    private ButtonRepeatThread buttonRepeatThread;
    
    private DecimalFormat frequencyFormat=new DecimalFormat("####0.000000");
    
    class ButtonRepeatThread extends Thread {
        
        ButtonRepeatThread(double increment) {
            this.increment=increment;
        }
        
        public void run() {
            while(!terminate) {
                try {
                    stepFrequency(increment);
                    sleep(200);
                } catch (Exception e) {
                    // just ignore it
                }
            }    
        }
        
        void terminate() {
            terminate=true;
        }
        
        double increment;
        boolean terminate=false;
    }
}
