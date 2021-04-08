package nik_lab6;

import javax.swing.ImageIcon;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jFrame5 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jFrame2.setTitle("Мое детство");
        jFrame2.setMinimumSize(new java.awt.Dimension(450, 450));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jButton2.setText("Назад");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton2);
        jButton2.setBounds(100, 360, 110, 30);

        jButton3.setText("Вперед");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton3);
        jButton3.setBounds(240, 360, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Прятки", "Казаки-Разбойники", "Светофор", "Классики" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(150, 40, 160, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Какие игры вы больше всего играли в детстве?");
        jFrame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 360, 40);
        jFrame2.getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 320, 210, 30);
        jFrame2.getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 70, 260, 240);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("Мое отрочество");
        jFrame3.setMinimumSize(new java.awt.Dimension(450, 450));
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton5.setText("Назад");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton5);
        jButton5.setBounds(120, 340, 80, 30);

        jButton6.setText("Вперед");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton6);
        jButton6.setBounds(270, 340, 90, 30);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Футбол", "Баскетбол", "Воллейбол", "Атлетика", "Не любил спорт" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jFrame3.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 160, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Каким видом спорта вы больше всего любили заниматься?");
        jFrame3.getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 10, 380, 40);
        jFrame3.getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 300, 130, 30);
        jFrame3.getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 70, 230, 250);

        jLabel8.setText("Выбранно:");
        jFrame3.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 300, 70, 30);

        jFrame3.setLocationRelativeTo(null);

        jFrame4.setTitle("Моя юность");
        jFrame4.setMinimumSize(new java.awt.Dimension(560, 460));
        jFrame4.setResizable(false);
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosing(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton1.setText("Врач");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton2.setText("Учитель");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton3.setText("Космонавт");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton4.setText("Программист");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton5.setText("Свой вариант");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrame4.getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 200, 150);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Кем вы хотели стать в юности?");
        jFrame4.getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 10, 310, 50);

        jButton7.setText("Назад");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton7);
        jButton7.setBounds(150, 330, 90, 30);

        jButton8.setText("Вперед");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton8);
        jButton8.setBounds(330, 330, 90, 30);
        jFrame4.getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 50, 280, 260);

        jFrame4.setLocationRelativeTo(null);

        jFrame5.setTitle("Вывод");
        jFrame5.setBackground(new java.awt.Color(255, 51, 51));
        jFrame5.setMinimumSize(new java.awt.Dimension(450, 450));
        jFrame5.setResizable(false);
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(181, 196, 215));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jFrame5.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 370, 230);

        jButton9.setText("Назад");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(100, 330, 100, 40);

        jButton10.setText("Выход");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(250, 330, 110, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Результаты анкетирования!");
        jFrame5.getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 10, 220, 50);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Приветствие!");
        setBackground(new java.awt.Color(0, 153, 102));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Вперед");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 250, 130, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("<html> <p align=\"center\">  <h1>Анкета</h1>  <br> <br> <br> <h3><cite><p align=\"center\">Тема - Периоды жизни</cite></h3> </p> ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 0, 90, 200);

        jButton4.setText("Выход");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 250, 130, 40);

        setSize(new java.awt.Dimension(432, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Переход на 2 окно, кнопка «Вперед»
        this.setVisible(false); // Спрятать главное окно 1
        jFrame2.setVisible(true); // Показать окно 2

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Переход на главное окно 1 из 2 окна, кнопка «Назад»
        jFrame2.setVisible(false); // Спрятать окно 2
        this.setVisible(true); // Показать главное окно 1

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Переход на 3 окно из 2 окна, кнопка «Вперед»
        jFrame2.setVisible(false); // Спрятать окно 2
        jFrame3.setVisible(true); // Показать окно 3

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        // Выход из программы
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        // TODO add your handling code here:        // Выход из программы
        System.exit(0); // Выход из программы

    }//GEN-LAST:event_jFrame3WindowClosing

    private void jFrame4WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosing
        // Выход из программы
        System.exit(0); // Выход из программы

    }//GEN-LAST:event_jFrame4WindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedIndex()) {

            case 0:
                jLabel3.setText("Выбранно: Прятки");
                jLabel5.setIcon(new ImageIcon(getClass().getResource("pr.jpg")));
                break;
            case 1:
                jLabel3.setText("Выбранно: Казаки-Разбойники");
                jLabel5.setIcon(new ImageIcon(getClass().getResource("kr.jpg")));
                break;
            case 2:
                jLabel3.setText("Выбранно: Светофор");
                jLabel5.setIcon(new ImageIcon(getClass().getResource("cv.jpg")));
                break;
            case 3:
                jLabel3.setText("Выбранно: Классики");
                jLabel5.setIcon(new ImageIcon(getClass().getResource("kl.jpg")));
                break;
        }


    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Переход на 2 окно из 3 окна, кнопка «Назад»
        jFrame3.setVisible(false); // Спрятать окно 3
        jFrame2.setVisible(true); // Показать окно 2

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame3.setVisible(false); // Спрятать окно 3
        jFrame4.setVisible(true); // Показать окно 2
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        jLabel8.setText(" Учитель");
        jLabel10.setIcon(new ImageIcon(getClass().getResource("u.jpg")));
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        jLabel8.setText(" Врач");
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
         jLabel10.setIcon(new ImageIcon(getClass().getResource("do.jpg")));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

        jLabel8.setText(" Программист");
        jLabel10.setIcon(new ImageIcon(getClass().getResource("prog.png")));
        if (jRadioButton4.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        jLabel8.setText(" Космонавт");
        jLabel10.setIcon(new ImageIcon(getClass().getResource("kosmo.jpg")));
        if (jRadioButton3.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed
  
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        switch (jList1.getSelectedIndex()) {

            case 0:
                jLabel6.setText("Футбол");
                 jLabel7.setIcon(new ImageIcon(getClass().getResource("f.jpg")));
                break;
            case 1:
                jLabel6.setText(" Баскетбол");
                 jLabel7.setIcon(new ImageIcon(getClass().getResource("bs.jpg")));
                break;
            case 2:
                jLabel6.setText(" Воллейбол");
                jLabel7.setIcon(new ImageIcon(getClass().getResource("vl.png")));
                break;
            case 3:
                jLabel6.setText(" Атлетика");
                jLabel7.setIcon(new ImageIcon(getClass().getResource("a.png")));
                break;
            case 4:
                jLabel6.setText(" Не любил спорт");
                jLabel7.setIcon(new ImageIcon(getClass().getResource("x.png")));
                break;

        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jFrame4WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosed
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jFrame4WindowClosed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        jLabel8.setText("Свой вариант");
        jLabel10.setIcon(new ImageIcon(getClass().getResource("x.png")));
        if (jRadioButton5.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton1.setSelected(false);
        }   
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame4.setVisible(false); // Спрятать окно 2
        jFrame5.setVisible(true); // Показать окно 3
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame4.setVisible(false); // Спрятать окно 2
        jFrame3.setVisible(true); // Показать окно 3
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame5.setVisible(false); // Спрятать окно 2
        jFrame4.setVisible(true); // Показать окно 3// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
        // Выдача результатов при открытии окна 
        jTextArea1.setText(""); // Очистка компонента
        jTextArea1.append("Вы выбрали:" + "\n");
        jTextArea1.append( "\n");
        jTextArea1.append("Любимый вид спорта: " + jList1.getSelectedValue().toString() + "\n");
        jTextArea1.append("Желаемая профессия: " + jLabel8.getText().toString() + "\n");
        jTextArea1.append("Игра детства: " + jComboBox1.getSelectedItem().toString() + "\n");
    }//GEN-LAST:event_jFrame5WindowActivated

    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
