package org.netbeans.minify.xml.ui.options;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.util.ChangeSupport;

public final class XmlOptionsPanel extends JPanel implements ChangeListener {
    private static final long serialVersionUID = 1L;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    public XmlOptionsPanel() {
        assert EventQueue.isDispatchThread();

        initComponents();

        init();
    }

    private void init() {
        DocumentListener defaultDocumentListener = new DefaultDocumentListener();
//        cssNanoCliPathTextField.getDocument().addDocumentListener(defaultDocumentListener);
    }

    public static XmlOptionsPanel create() {
        XmlOptionsPanel panel = new XmlOptionsPanel();

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
        newXMLFile = new javax.swing.JCheckBox();
        preExtensionXML_Label = new javax.swing.JLabel();
        preExtensionXML = new javax.swing.JTextField();
        autoMinifyXML = new javax.swing.JCheckBox();
        extLabel = new javax.swing.JLabel();
        headerLabelXML = new javax.swing.JLabel();
        headerScrollPaneXML = new javax.swing.JScrollPane();
        headerEditorPaneXML = new javax.swing.JEditorPane();

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

        newXMLFile.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(newXMLFile, org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.newJSFile.text")); // NOI18N
        newXMLFile.setToolTipText(org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.newJSFile.toolTipText")); // NOI18N
        newXMLFile.setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(preExtensionXML_Label, org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.preExtensionJS_Label.text")); // NOI18N

        preExtensionXML.setText(org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.preExtensionJS.text")); // NOI18N

        autoMinifyXML.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(autoMinifyXML, org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.autoMinifyJS.text")); // NOI18N
        autoMinifyXML.setOpaque(false);

        extLabel.setForeground(extLabel.getForeground().darker());
        org.openide.awt.Mnemonics.setLocalizedText(extLabel, org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.extLabel.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newXMLFile)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoMinifyXML, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preExtensionXML_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preExtensionXML, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extLabel)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preExtensionXML_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extLabel)
                    .addComponent(preExtensionXML, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(autoMinifyXML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newXMLFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(headerLabelXML, org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.headerLabelJS.text")); // NOI18N

        headerEditorPaneXML.setToolTipText(org.openide.util.NbBundle.getMessage(XmlOptionsPanel.class, "JsOptionsPanel.headerEditorPaneJS.toolTipText")); // NOI18N
        headerScrollPaneXML.setViewportView(headerEditorPaneXML);

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
                    .addComponent(headerLabelXML)
                    .addComponent(headerScrollPaneXML, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(headerLabelXML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerScrollPaneXML, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    public javax.swing.JCheckBox autoMinifyXML;
    private javax.swing.JLabel extLabel;
    protected javax.swing.JEditorPane headerEditorPaneXML;
    private javax.swing.JLabel headerLabelXML;
    private javax.swing.JScrollPane headerScrollPaneXML;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JCheckBox newXMLFile;
    public javax.swing.JTextField preExtensionXML;
    public javax.swing.JLabel preExtensionXML_Label;
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
