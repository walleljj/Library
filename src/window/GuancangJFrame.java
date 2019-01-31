/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import bean.Books;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Query;

/**
 *
 * @author 绘梦
 */
public class GuancangJFrame extends javax.swing.JFrame {
	javax.swing.table.DefaultTableModel model = null;

	/**
	 * Creates new form GuangcangJFrame
	 */
	public GuancangJFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel5 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jTextField5 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("馆藏查询");
		setLocation(new java.awt.Point(550, 400));
		setName("馆藏查询"); // NOI18N

		jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jLabel5.setText("查询方式：");

		jComboBox1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-请选择-", "编号", "书名", "作者", "出版社" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jTextField5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/shangpin_chaxun.png"))); // NOI18N
		jButton3.setText("搜索");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(null, new String[] { "编号", "书名", "作者", "出版社", "是否在架" }) {
					boolean[] canEdit = new boolean[] { false, false, false, false, false };

					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
		// model.addRow(new Object[]{"123","456","789","147","258"});
		jTable1.setColumnSelectionAllowed(true);
		jTable1.setRowHeight(30);
		jScrollPane1.setViewportView(jTable1);
		jTable1.getColumnModel().getSelectionModel()
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		jButton4.setText("取消");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(
						jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout
										.createSequentialGroup().addGroup(jPanel5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jScrollPane1)
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
																jPanel5Layout.createSequentialGroup().addContainerGap()
																		.addComponent(jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jTextField5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				225,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jButton3))))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(31, 31, 31)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
						.addGap(18, 18, 18).addComponent(jButton4).addGap(18, 18, 18)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 614, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 28, Short.MAX_VALUE)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 28, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 517, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBox1ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		String cb = (String) jComboBox1.getSelectedItem();
		String jt = jTextField5.getText();
		HashMap<String, Books> map = null;
		switch (cb) {
		// 以编号查找
		case "编号":
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);// 清除表数据
			}
			try {
				map = new Query().idQuery(jt);
			} catch (IOException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			}
			Set<String> key1 = map.keySet();
			for (String v : key1) {
				Books book = map.get(v);
				model.addRow(new Object[] { book.getId(), book.getName(), book.getAuthor(), book.getPress(),
						book.isState() });
			}
			break;
		// 以书名查找
		case "书名":
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);// 清除表数据
			}
			try {
				map = new Query().nameQuery(jt);
			} catch (IOException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			}
			Set<String> key = map.keySet();
			for (String v : key) {
				Books book = map.get(v);
				model.addRow(new Object[] { book.getId(), book.getName(), book.getAuthor(), book.getPress(),
						book.isState() });
			}
			break;
		// 以作者查找
		case "作者":
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);// 清除表数据
			}
			try {
				map = new Query().authorQuery(jt);
			} catch (IOException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			}
			Set<String> keys = map.keySet();
			for (String v : keys) {
				Books book = map.get(v);
				model.addRow(new Object[] { book.getId(), book.getName(), book.getAuthor(), book.getPress(),
						book.isState() });
			}
			break;
		// 以出版社查找
		case "出版社":
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);// 清除表数据
			}
			try {
				map = new Query().pressQuery(jt);
			} catch (IOException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(GuanliJFrame1.class.getName()).log(Level.SEVERE, null, ex);
			}
			Set<String> key2 = map.keySet();
			for (String v : key2) {
				Books book = map.get(v);
				model.addRow(new Object[] { book.getId(), book.getName(), book.getAuthor(), book.getPress(),
						book.isState() });
			}
			break;
		case "-请选择-":
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);// 清除表数据
			}
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
				map = (HashMap<String, Books>) ois.readObject();
				Set<String> key3 = map.keySet();
				for (String v : key3) {
					Books book = map.get(v);
					model.addRow(new Object[] { book.getId(), book.getName(), book.getAuthor(), book.getPress(),
							book.isState() });
				}
			} catch (FileNotFoundException ex) {
				Logger.getLogger(GuancangJFrame.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(GuancangJFrame.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(GuancangJFrame.class.getName()).log(Level.SEVERE, null, ex);
			}
			break;
		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		setVisible(false);
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField5ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GuancangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GuancangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GuancangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GuancangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GuancangJFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables
}
