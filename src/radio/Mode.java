/*
 * Mode.java
 *
 * Created on September 9, 2007, 5:49 PM
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

import java.awt.Color;

/**
 *
 *  Mode
 */
public class Mode extends javax.swing.JPanel implements ModeInterface {
    
    /** Creates new form Mode */
    public Mode() {
        initComponents();
    }
    
    public void addListener(ModeListener modeListener) {
        this.modeListener=modeListener;
    }
    
    public void select(Modes mode) {
        javax.swing.JButton button=getButton(mode);
        if(button!=null) {
            button.setForeground(Color.YELLOW);
        }
    }
    
    public void unselect(Modes mode) {
        javax.swing.JButton button=getButton(mode);
        if(button!=null) {
            button.setForeground(Color.BLACK);
        }
    }
    
    private javax.swing.JButton getButton(Modes mode) {
        javax.swing.JButton button=null;
        switch(mode) {
            case LSB:
                button=jButton1;
                break;
            case USB:
                button=jButton2;
                break;
            case DSB:
                button=jButton3;
                break;
            case CWL:
                button=jButton4;
                break;
            case CWU:
                button=jButton5;
                break;
            case FMN:
                button=jButton6;
                break;
            case AM:
                button=jButton7;
                break;
            case SAM:
                button=jButton8;
                break;
            case SPEC:
                button=jButton9;
                break;
            case DIGL:
                button=jButton10;
                break;
            case DIGU:
                button=jButton11;
                break;
            case DRM:
                button=jButton12;
                break;
        }
        return button;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setText("Mode");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("LSB");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("USB");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("DSB");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("CWL");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setText("CWU");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, -1));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("FMN");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 50, -1));

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setText("AM");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setText("SAM");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, -1));

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setText("SPEC");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 50, -1));

        jButton10.setBackground(new java.awt.Color(153, 153, 153));
        jButton10.setText("DIGL");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setText("DIGU");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, -1));

        jButton12.setBackground(new java.awt.Color(153, 153, 153));
        jButton12.setText("DRM");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 50, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        modeListener.modeSelected(Modes.DRM);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        modeListener.modeSelected(Modes.DIGU);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        modeListener.modeSelected(Modes.DIGL);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        modeListener.modeSelected(Modes.SPEC);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        modeListener.modeSelected(Modes.SAM);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        modeListener.modeSelected(Modes.AM);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modeListener.modeSelected(Modes.FMN);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modeListener.modeSelected(Modes.CWU);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modeListener.modeSelected(Modes.CWL);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modeListener.modeSelected(Modes.DSB);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modeListener.modeSelected(Modes.USB);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modeListener.modeSelected(Modes.LSB);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    private ModeListener modeListener;
}
