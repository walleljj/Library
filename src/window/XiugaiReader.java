/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

/**
 *
 * @author 绘梦
 */
public class XiugaiReader extends javax.swing.JFrame {

	/**
	 * Creates new form XiugaiReader
	 */
	public XiugaiReader() {
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

		jLabel1 = new javax.swing.JLabel();
		jLabelPass = new javax.swing.JLabel();
		jPasswordFieldPass = new javax.swing.JPasswordField();
		jLabelName = new javax.swing.JLabel();
		jTextFieldName = new javax.swing.JTextField();
		jLabelAge = new javax.swing.JLabel();
		jTextFieldAge = new javax.swing.JTextField();
		jLabelSex = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("修改读者信息");
		setName("读者信息修改"); // NOI18N

		jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
		jLabel1.setText("读者信息修改");

		jLabelPass.setText("密码：");

		jPasswordFieldPass.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordFieldPassActionPerformed(evt);
			}
		});

		jLabelName.setText("姓名：");

		jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNameActionPerformed(evt);
			}
		});

		jLabelAge.setText("年龄：");

		jLabelSex.setText("性别：");

		jRadioButton1.setText("男");

		jRadioButton2.setText("女");

		jButton1.setText("确认");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("取消");

		jLabel2.setText("用户名：");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout
										.createSequentialGroup().addContainerGap().addComponent(jButton1)
										.addGap(18, 18, 18).addComponent(jButton2))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addGap(64, 64, 64)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabelName).addComponent(jLabelAge)
												.addComponent(jLabelSex, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jRadioButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 53,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jRadioButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 56,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jTextFieldName,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jTextFieldAge,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jPasswordFieldPass,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 81,
																Short.MAX_VALUE)))))
						.addGroup(layout.createSequentialGroup().addGap(53, 53, 53).addComponent(jLabel2)))
				.addContainerGap(54, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelSex, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jRadioButton1).addComponent(jRadioButton2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2))
						.addGap(30, 30, 30)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jPasswordFieldPassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jPasswordFieldPassActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jPasswordFieldPassActionPerformed

	private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldNameActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(XiugaiReader.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(XiugaiReader.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(XiugaiReader.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(XiugaiReader.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new XiugaiReader().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabelAge;
	private javax.swing.JLabel jLabelName;
	private javax.swing.JLabel jLabelPass;
	private javax.swing.JLabel jLabelSex;
	private javax.swing.JPasswordField jPasswordFieldPass;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextFieldAge;
	private javax.swing.JTextField jTextFieldName;
	// End of variables declaration//GEN-END:variables
}
