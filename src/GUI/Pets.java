
package GUI;
import CONTROLLER.Pet;
import CONTROLLER.Product;
import CONTROLLER.PetPreparedStatement;
import CONTROLLER.ProductPreparedStatement;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Pets extends javax.swing.JFrame {

    /**
     * Creates new form pet_table
     */
    public Pets() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PET_INFO = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Product_info = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        PET_PRICE = new javax.swing.JTextField();
        PRODUCT_PRICE = new javax.swing.JTextField();
        PET_BREED = new javax.swing.JTextField();
        PET_AGE = new javax.swing.JTextField();
        PET_NAME = new javax.swing.JTextField();
        PRODUCT_NAME = new javax.swing.JTextField();
        PRODUCT_ID = new javax.swing.JTextField();
        delete_product = new javax.swing.JButton();
        update_product = new javax.swing.JButton();
        update_pet = new javax.swing.JButton();
        search_product = new javax.swing.JButton();
        create_product = new javax.swing.JButton();
        delete_pet = new javax.swing.JButton();
        create_pet = new javax.swing.JButton();
        search_pet = new javax.swing.JButton();
        back_menu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Pet_id = new javax.swing.JTextField();
        Reload = new javax.swing.JButton();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pexels-photo-1108099.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel5ComponentShown(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setText("PETS MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 21, 450, -1));

        PET_INFO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "BREED", "AGE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PET_INFO.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PET_INFOComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(PET_INFO);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 520, 140));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRODUCT INFORMATION");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 170, -1));

        Product_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT_ID", "NAME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Product_info.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Product_infoComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(Product_info);
        if (Product_info.getColumnModel().getColumnCount() > 0) {
            Product_info.getColumnModel().getColumn(0).setResizable(false);
            Product_info.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 520, 190));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PET INFORMATION");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Breed");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Age");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Product_Id");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Price");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 20));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Name");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        PET_PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PET_PRICEActionPerformed(evt);
            }
        });
        getContentPane().add(PET_PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 350, -1));

        PRODUCT_PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCT_PRICEActionPerformed(evt);
            }
        });
        getContentPane().add(PRODUCT_PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 350, -1));
        getContentPane().add(PET_BREED, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 350, -1));
        getContentPane().add(PET_AGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 350, -1));

        PET_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PET_NAMEActionPerformed(evt);
            }
        });
        getContentPane().add(PET_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 350, -1));

        PRODUCT_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCT_NAMEActionPerformed(evt);
            }
        });
        getContentPane().add(PRODUCT_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 350, -1));

        PRODUCT_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCT_IDActionPerformed(evt);
            }
        });
        getContentPane().add(PRODUCT_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 350, -1));

        delete_product.setText("DELETE");
        delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_productActionPerformed(evt);
            }
        });
        getContentPane().add(delete_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        update_product.setText("UPDATE");
        update_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_productActionPerformed(evt);
            }
        });
        getContentPane().add(update_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        update_pet.setText("UPDATE");
        update_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_petActionPerformed(evt);
            }
        });
        getContentPane().add(update_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        search_product.setText("SEARCH");
        search_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_productActionPerformed(evt);
            }
        });
        getContentPane().add(search_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        create_product.setText("CREATE");
        create_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_productActionPerformed(evt);
            }
        });
        getContentPane().add(create_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, -1));

        delete_pet.setText("DELETE");
        delete_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_petActionPerformed(evt);
            }
        });
        getContentPane().add(delete_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        create_pet.setText("CREATE");
        create_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_petActionPerformed(evt);
            }
        });
        getContentPane().add(create_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        search_pet.setText("SEARCH");
        search_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_petActionPerformed(evt);
            }
        });
        getContentPane().add(search_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        back_menu.setText("BACK TO MENU");
        back_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_menuActionPerformed(evt);
            }
        });
        getContentPane().add(back_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 190, 40));

        jButton1.setText("MOVE TO PERSONAL INFO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 210, 40));

        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 190, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Pet_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet_idActionPerformed(evt);
            }
        });
        getContentPane().add(Pet_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 350, -1));

        Reload.setText("Reload");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });
        getContentPane().add(Reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PRODUCT_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCT_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRODUCT_PRICEActionPerformed

    private void PET_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PET_NAMEActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PET_NAMEActionPerformed

    private void PRODUCT_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCT_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRODUCT_NAMEActionPerformed

    private void PRODUCT_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCT_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRODUCT_IDActionPerformed

    private void delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_productActionPerformed
        // TODO add your handling code here
      String id = PRODUCT_ID.getText();
      int a =  JOptionPane.showConfirmDialog(null,"Confirm Deletion","DELETE",JOptionPane.YES_NO_CANCEL_OPTION);
      if(a==0)
      {
          ProductPreparedStatement.Delete(id);
          setVisible(false);
          new Pets().setVisible(true);
      }
    }//GEN-LAST:event_delete_productActionPerformed

    private void update_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_petActionPerformed
        // TODO add your handling code here:
        	Pet p = new Pet();
		try {
			p.setId(Integer.parseInt(Pet_id.getText()));
			p.setName(PET_NAME.getText());
			p.setBreed(PET_BREED.getText());
			p.setAge(Integer.parseInt(PET_AGE.getText()));
			p.setPrice(Double.parseDouble(PET_PRICE.getText()));
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		PetPreparedStatement.Update(p);
                //reload
		setVisible(false);
		new Pets().setVisible(true);
    }//GEN-LAST:event_update_petActionPerformed

    private void search_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_productActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
    }//GEN-LAST:event_search_productActionPerformed

    private void delete_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_petActionPerformed
        // TODO add your handling code here:
      String id = Pet_id.getText();
      int a=  JOptionPane.showConfirmDialog(null,"Confirm Deletion","Select",JOptionPane.YES_NO_CANCEL_OPTION);
      if(a==0)
      {
          PetPreparedStatement.Delete(id);
          setVisible(false);
          new Pets().setVisible(true);
      }
        
//        PetPreparedStatement.Delete(p); 
         //reload the jpanel
//        DefaultTableModel dtm = (DefaultTableModel) PET_INFO.getModel();
//        ArrayList<Pet> pet_list = PetPreparedStatement.Display();
//        for (Pet p2 : pet_list) {
//            dtm.addRow(new Object[]
//            {p2.getName(),p2.getBreed(),p2.getAge(),p.getPrice()} );
//        }
        
    }//GEN-LAST:event_delete_petActionPerformed

    private void create_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_petActionPerformed
        // TODO add your handling code here:
        //this code  implements cresating  new information into PET TABLE
        Pet p = new Pet();
        String pet_id =  Pet_id.getText();
        if(!pet_id.isEmpty())
        {
            try{
                int id = Integer.parseInt(pet_id);
                p.setId(id);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid age format"+ pet_id);
                
            }
        }
        else{
            System.out.println("Age field is empty");
        }
        p.setName(PET_NAME.getText());
        p.setBreed(PET_BREED.getText());
        //get the text from the age field
        String ageText = PET_AGE.getText();
        if(!ageText.isEmpty())
        {
            try{
                int age = Integer.parseInt(ageText);
                p.setAge(age);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid age format"+ ageText);
                
            }
        }
        else{
            System.out.println("Age field is empty");
        }
        String priceText = PET_PRICE.getText();
        if(!priceText.isEmpty())
        {
                try{
                    double price = Double.parseDouble(priceText);
                    p.setPrice(price);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Invalid price format"+priceText);
                }
        }
        else{
            System.out.println("Price field is empty");
        }
        PetPreparedStatement.Create(p);
        setVisible(false);
        new Pets().setVisible(true);
        
    }//GEN-LAST:event_create_petActionPerformed
    
    private void search_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_petActionPerformed
       // TODO add your handling code here:
        Pet p = null;
        try {
                p = PetPreparedStatement.Search(Integer.parseInt(Pet_id.getText()));
                if (p == null) {
                        JOptionPane.showMessageDialog(null, "No pet with such ID!");
                } else {
                        DefaultTableModel dtm  =  (DefaultTableModel) PET_INFO.getModel();
                        dtm.setRowCount(0);
                        dtm.addRow(new Object[]{p.getId(),p.getName(),p.getBreed(),p.getAge(),p.getPrice()});
                }
        }
        catch(NumberFormatException e)
        {
                JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_search_petActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) PET_INFO.getModel();
        ArrayList<Pet> pet_list = PetPreparedStatement.Display();
        for (Pet p : pet_list) {
            dtm.addRow(new Object[]
            {p.getId(),p.getName(),p.getBreed(),p.getAge(),p.getPrice()} );
        }
        
        
        DefaultTableModel dm = (DefaultTableModel) Product_info.getModel();
        ArrayList<Product> product_list = ProductPreparedStatement.Display();
        for (Product p : product_list) {
            dm.addRow(new Object[]
            {p.getProductID(),p.getName(),p.getPrice()} );
        }
        
    }//GEN-LAST:event_formComponentShown

    private void back_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_menuActionPerformed
       
        setVisible(false);
        new Login_form().setVisible(true);
        
    }//GEN-LAST:event_back_menuActionPerformed

    private void PET_INFOComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PET_INFOComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_PET_INFOComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new Personal_Info().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        
        int a =JOptionPane.showConfirmDialog(null, "confirm closed application","message",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void Product_infoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Product_infoComponentShown
        // TODO add your handling code here:
//        DefaultTableModel dtm = (DefaultTableModel) Product_info.getModel();
//        ArrayList<Product> list = ProductPreparedStatement.Display();
//        for (Product p : list) {
//            dtm.addRow(new Object[]
//            {p.getName(),p.getProductID(),p.getPrice()} );
//        }
    }//GEN-LAST:event_Product_infoComponentShown

    private void jLabel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel5ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5ComponentShown

    private void PET_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PET_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PET_PRICEActionPerformed

    private void Pet_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pet_idActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        setVisible(false);
        new Pets().setVisible(true);
        
        
    }//GEN-LAST:event_ReloadActionPerformed

    private void create_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_productActionPerformed
        // TODO add your handling code here:
        
        Product p = new Product();
        String product_id =  PRODUCT_ID.getText();
        if(!product_id.isEmpty())
        {
            try{
                int id = Integer.parseInt(product_id);
                p.setProductID(id);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid id format"+ product_id);
                
            }
        }
        else{
            System.out.println("ID field is empty");
        }
        p.setName(PRODUCT_NAME.getText());
        
        
        String priceText = PRODUCT_PRICE.getText();
        if(!priceText.isEmpty())
        {
                try{
                    double price = Double.parseDouble(priceText);
                    p.setPrice(price);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Invalid price format"+priceText);
                }
        }
        else{
            System.out.println("Price field is empty");
        }
        ProductPreparedStatement.Create(p);
        setVisible(false);
        new Pets().setVisible(true);
        
    }//GEN-LAST:event_create_productActionPerformed

    private void update_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_productActionPerformed
        // TODO add your handling code here:
        Product p = new Product();
		try {
			p.setProductID(Integer.parseInt(PRODUCT_ID.getText()));
			p.setName(PRODUCT_NAME.getText());
			p.setPrice(Double.parseDouble(PRODUCT_PRICE.getText()));
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		ProductPreparedStatement.Update(p);
                //reload
		setVisible(false);
		new Pets().setVisible(true);
    }//GEN-LAST:event_update_productActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField PET_AGE;
    private javax.swing.JTextField PET_BREED;
    private javax.swing.JTable PET_INFO;
    private javax.swing.JTextField PET_NAME;
    private javax.swing.JTextField PET_PRICE;
    private javax.swing.JTextField PRODUCT_ID;
    private javax.swing.JTextField PRODUCT_NAME;
    private javax.swing.JTextField PRODUCT_PRICE;
    private javax.swing.JTextField Pet_id;
    private javax.swing.JTable Product_info;
    private javax.swing.JButton Reload;
    private javax.swing.JButton back_menu;
    private javax.swing.JButton create_pet;
    private javax.swing.JButton create_product;
    private javax.swing.JButton delete_pet;
    private javax.swing.JButton delete_product;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search_pet;
    private javax.swing.JButton search_product;
    private javax.swing.JButton update_pet;
    private javax.swing.JButton update_product;
    // End of variables declaration//GEN-END:variables
}
