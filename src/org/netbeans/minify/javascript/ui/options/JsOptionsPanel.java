package org.netbeans.minify.javascript.ui.options;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.util.ChangeSupport;

public final class JsOptionsPanel extends JPanel implements ChangeListener {
    private static final long serialVersionUID = 1L;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    public JsOptionsPanel() {
        assert EventQueue.isDispatchThread();

        initComponents();

        init();
    }

    private void init() {
        DocumentListener defaultDocumentListener = new DefaultDocumentListener();
//        cssNanoCliPathTextField.getDocument().addDocumentListener(defaultDocumentListener);
    }

    public static JsOptionsPanel create() {
        JsOptionsPanel panel = new JsOptionsPanel();

        return panel;
    }

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

//    public String getCssNanoCli() {
//        return cssNanoCliPathTextField.getText();
//    }
//
//    public void setCssNanoCli(String cssNanoCli) {
//        cssNanoCliPathTextField.setText(cssNanoCli);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newJSFile = new javax.swing.JCheckBox();
        preExtensionJS_Label = new javax.swing.JLabel();
        preExtensionJS = new javax.swing.JTextField();
        autoMinifyJS = new javax.swing.JCheckBox();
        extLabel = new javax.swing.JLabel();
        jsObfuscate = new javax.swing.JCheckBox();
        headerLabelJS = new javax.swing.JLabel();
        headerScrollPaneJS = new javax.swing.JScrollPane();
        headerEditorPaneJS = new javax.swing.JEditorPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(762, 86));

        newJSFile.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(newJSFile, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.newJSFile.text")); // NOI18N
        newJSFile.setToolTipText(org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.newJSFile.toolTipText")); // NOI18N
        newJSFile.setOpaque(false);
        newJSFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJSFileActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(preExtensionJS_Label, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.preExtensionJS_Label.text")); // NOI18N

        preExtensionJS.setText(org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.preExtensionJS.text")); // NOI18N
        preExtensionJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preExtensionJSActionPerformed(evt);
            }
        });

        autoMinifyJS.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(autoMinifyJS, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.autoMinifyJS.text")); // NOI18N
        autoMinifyJS.setOpaque(false);
        autoMinifyJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoMinifyJSActionPerformed(evt);
            }
        });

        extLabel.setForeground(extLabel.getForeground().darker());
        org.openide.awt.Mnemonics.setLocalizedText(extLabel, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.extLabel.text")); // NOI18N

        jsObfuscate.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jsObfuscate, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.jsObfuscate.text")); // NOI18N
        jsObfuscate.setOpaque(false);
        jsObfuscate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsObfuscateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newJSFile)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoMinifyJS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preExtensionJS_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(preExtensionJS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extLabel))
                            .addComponent(jsObfuscate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preExtensionJS_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extLabel)
                    .addComponent(preExtensionJS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoMinifyJS)
                    .addComponent(jsObfuscate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newJSFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(headerLabelJS, org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.headerLabelJS.text")); // NOI18N

        headerEditorPaneJS.setToolTipText(org.openide.util.NbBundle.getMessage(JsOptionsPanel.class, "JsOptionsPanel.headerEditorPaneJS.toolTipText")); // NOI18N
        headerScrollPaneJS.setViewportView(headerEditorPaneJS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabelJS)
                    .addComponent(headerScrollPaneJS, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelJS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerScrollPaneJS, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//    @NbBundle.Messages("CssNanoCliOptionsPanel.browse.title=Select CSSNano CLI")
//    @NbBundle.Messages("CssNanoCliOptionsPanel.executable.notFound=No CSSNano CLI executable found.")
    private void newJSFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJSFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newJSFileActionPerformed

    private void preExtensionJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preExtensionJSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preExtensionJSActionPerformed

    private void autoMinifyJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoMinifyJSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoMinifyJSActionPerformed

    private void jsObfuscateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsObfuscateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsObfuscateActionPerformed

//    void load() {
//        String ngCli = NbPreferences.forModule(CssOptionsPanel.class).get("ngCliExecutableLocation", "");
//        cssNanoCliPathTextField.setText(ngCli);
//    }
//    void store() {
//        NbPreferences.forModule(CssOptionsPanel.class).put("ngCliExecutableLocation", cssNanoCliPathTextField.getText());
//    }
    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox autoMinifyJS;
    private javax.swing.JLabel extLabel;
    protected javax.swing.JEditorPane headerEditorPaneJS;
    private javax.swing.JLabel headerLabelJS;
    private javax.swing.JScrollPane headerScrollPaneJS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JCheckBox jsObfuscate;
    public javax.swing.JCheckBox newJSFile;
    public javax.swing.JTextField preExtensionJS;
    public javax.swing.JLabel preExtensionJS_Label;
    // End of variables declaration//GEN-END:variables

    void fireChange() {
        changeSupport.fireChange();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        fireChange();
    }

    private final class DefaultDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            processUpdate();
        }

        private void processUpdate() {
            fireChange();
        }

    }
}
