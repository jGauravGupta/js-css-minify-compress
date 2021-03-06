package io.github.chris2011.netbeans.minifierbeans.project.ui.options;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import io.github.chris2011.netbeans.minifierbeans.ui.MinifyProperty;
import org.openide.util.ChangeSupport;

public final class ProjectOptionsPanel extends JPanel implements ChangeListener {
    private static final long serialVersionUID = 1L;
    private final ChangeSupport changeSupport = new ChangeSupport(this);
    private MinifyProperty minifyProperty;

    public ProjectOptionsPanel() {
        assert EventQueue.isDispatchThread();

        initComponents();

        init();
    }

    private void init() {
        minifyProperty = MinifyProperty.getInstance();

        if (minifyProperty.isSeparatBuild()) {
            this.separatBuild.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildJSMinify()) {
            this.buildJSMinify.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildCSSMinify()) {
            this.buildCSSMinify.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildHTMLMinify()) {
            this.buildHTMLMinify.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildXMLMinify()) {
            this.buildXMLMinify.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildJSONMinify()) {
            this.buildJSONMinify.setSelected(Boolean.TRUE);
        }

        if (minifyProperty.isBuildJSMinify() && minifyProperty.isNewJSFile()) {
            this.skipPreExtensionJS.setEnabled(Boolean.TRUE);
            if (minifyProperty.isSkipPreExtensionJS()) {
                skipPreExtensionJS.setSelected(Boolean.TRUE);
            } else {
                skipPreExtensionJS.setSelected(Boolean.FALSE);
            }
        } else {
            this.skipPreExtensionJS.setEnabled(Boolean.FALSE);
            skipPreExtensionJS.setSelected(Boolean.FALSE);
        }

        if (minifyProperty.isBuildCSSMinify() && minifyProperty.isNewCSSFile()) {
            skipPreExtensionCSS.setEnabled(Boolean.TRUE);
            if (minifyProperty.isSkipPreExtensionCSS()) {
                skipPreExtensionCSS.setSelected(Boolean.TRUE);
            } else {
                skipPreExtensionCSS.setSelected(Boolean.FALSE);
            }
        } else {
            this.skipPreExtensionCSS.setEnabled(Boolean.FALSE);
            skipPreExtensionCSS.setSelected(Boolean.FALSE);
        }

        if (minifyProperty.isBuildHTMLMinify() && minifyProperty.isNewHTMLFile()) {
            skipPreExtensionHTML.setEnabled(Boolean.TRUE);
            if (minifyProperty.isSkipPreExtensionHTML()) {
                skipPreExtensionHTML.setSelected(Boolean.TRUE);
            } else {
                skipPreExtensionHTML.setSelected(Boolean.FALSE);
            }
        } else {
            this.skipPreExtensionHTML.setEnabled(Boolean.FALSE);
            skipPreExtensionHTML.setSelected(Boolean.FALSE);
        }

        if (minifyProperty.isBuildXMLMinify() && minifyProperty.isNewXMLFile()) {
            skipPreExtensionXML.setEnabled(Boolean.TRUE);
            if (minifyProperty.isSkipPreExtensionXML()) {
                skipPreExtensionXML.setSelected(Boolean.TRUE);
            } else {
                skipPreExtensionXML.setSelected(Boolean.FALSE);
            }
        } else {
            this.skipPreExtensionXML.setEnabled(Boolean.FALSE);
            skipPreExtensionXML.setSelected(Boolean.FALSE);
        }

        if (minifyProperty.isBuildJSONMinify() && minifyProperty.isNewJSONFile()) {
            skipPreExtensionJSON.setEnabled(Boolean.TRUE);
            if (minifyProperty.isSkipPreExtensionJSON()) {
                skipPreExtensionJSON.setSelected(Boolean.TRUE);
            } else {
                skipPreExtensionJSON.setSelected(Boolean.FALSE);
            }
        } else {
            this.skipPreExtensionJSON.setEnabled(Boolean.FALSE);
            skipPreExtensionJSON.setSelected(Boolean.FALSE);
        }

        this.separatBuild.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSeparatBuild(Boolean.TRUE);
                } else {
                    minifyProperty.setSeparatBuild(Boolean.FALSE);
                }
            }
        });
        this.buildJSMinify.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setBuildJSMinify(Boolean.TRUE);
                    if (minifyProperty.isBuildJSMinify() && minifyProperty.isNewJSFile()) {
                        skipPreExtensionJS.setEnabled(Boolean.TRUE);
                        minifyProperty.setSkipPreExtensionJS(Boolean.TRUE);
                        skipPreExtensionJS.setSelected(Boolean.TRUE);
                    }
                } else {
                    minifyProperty.setBuildJSMinify(Boolean.FALSE);
                    skipPreExtensionJS.setEnabled(Boolean.FALSE);
                    minifyProperty.setSkipPreExtensionJS(Boolean.FALSE);
                    skipPreExtensionJS.setSelected(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });
        this.skipPreExtensionJS.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSkipPreExtensionJS(Boolean.TRUE);
                } else {
                    minifyProperty.setSkipPreExtensionJS(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });
        this.buildCSSMinify.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setBuildCSSMinify(Boolean.TRUE);
                    if (minifyProperty.isBuildCSSMinify() && minifyProperty.isNewCSSFile()) {
                        skipPreExtensionCSS.setEnabled(Boolean.TRUE);
                        minifyProperty.setSkipPreExtensionCSS(Boolean.TRUE);
                        skipPreExtensionCSS.setSelected(Boolean.TRUE);
                    }
                } else {
                    minifyProperty.setBuildCSSMinify(Boolean.FALSE);
                    skipPreExtensionCSS.setEnabled(Boolean.FALSE);
                    minifyProperty.setSkipPreExtensionCSS(Boolean.FALSE);
                    skipPreExtensionCSS.setSelected(Boolean.FALSE);
                }
            }
        });
        this.skipPreExtensionCSS.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSkipPreExtensionCSS(Boolean.TRUE);
                } else {
                    minifyProperty.setSkipPreExtensionCSS(Boolean.FALSE);
                }
            }
        });
        this.buildHTMLMinify.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setBuildHTMLMinify(Boolean.TRUE);
                    if (minifyProperty.isBuildHTMLMinify() && minifyProperty.isNewHTMLFile()) {
                        skipPreExtensionHTML.setEnabled(Boolean.TRUE);
                        minifyProperty.setSkipPreExtensionHTML(Boolean.TRUE);
                        skipPreExtensionHTML.setSelected(Boolean.TRUE);
                    }
                } else {
                    minifyProperty.setBuildHTMLMinify(Boolean.FALSE);
                    skipPreExtensionHTML.setEnabled(Boolean.FALSE);
                    minifyProperty.setSkipPreExtensionHTML(Boolean.FALSE);
                    skipPreExtensionHTML.setSelected(Boolean.FALSE);

                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });
        this.skipPreExtensionHTML.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSkipPreExtensionHTML(Boolean.TRUE);
                } else {
                    minifyProperty.setSkipPreExtensionHTML(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });

        this.buildXMLMinify.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setBuildXMLMinify(Boolean.TRUE);
                    if (minifyProperty.isBuildXMLMinify() && minifyProperty.isNewXMLFile()) {
                        skipPreExtensionXML.setEnabled(Boolean.TRUE);
                        minifyProperty.setSkipPreExtensionXML(Boolean.TRUE);
                        skipPreExtensionXML.setSelected(Boolean.TRUE);
                    }
                } else {
                    minifyProperty.setBuildXMLMinify(Boolean.FALSE);
                    skipPreExtensionXML.setEnabled(Boolean.FALSE);
                    minifyProperty.setSkipPreExtensionXML(Boolean.FALSE);
                    skipPreExtensionXML.setSelected(Boolean.FALSE);
                }
            }
        });
        this.skipPreExtensionXML.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSkipPreExtensionXML(Boolean.TRUE);
                } else {
                    minifyProperty.setSkipPreExtensionXML(Boolean.FALSE);
                }
            }
        });

        this.buildJSONMinify.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setBuildJSONMinify(Boolean.TRUE);
                    if (minifyProperty.isBuildJSONMinify() && minifyProperty.isNewJSONFile()) {
                        skipPreExtensionJSON.setEnabled(Boolean.TRUE);
                        minifyProperty.setSkipPreExtensionJSON(Boolean.TRUE);
                        skipPreExtensionJSON.setSelected(Boolean.TRUE);
                    }
                } else {
                    minifyProperty.setBuildJSONMinify(Boolean.FALSE);
                    skipPreExtensionJSON.setEnabled(Boolean.FALSE);
                    minifyProperty.setSkipPreExtensionJSON(Boolean.FALSE);
                    skipPreExtensionJSON.setSelected(Boolean.FALSE);
                }
            }
        });
        this.skipPreExtensionJSON.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setSkipPreExtensionJSON(Boolean.TRUE);
                } else {
                    minifyProperty.setSkipPreExtensionJSON(Boolean.FALSE);
                }
            }
        });

        if (minifyProperty.isAppendLogToFile()) {
            this.addLogToFile.setSelected(Boolean.TRUE);
        } else {
            this.addLogToFile.setSelected(Boolean.FALSE);
        }
        this.addLogToFile.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setAppendLogToFile(Boolean.TRUE);
                } else {
                    minifyProperty.setAppendLogToFile(Boolean.FALSE);
                }
            }
        });

        if (minifyProperty.isEnableOutputLogAlert()) {
            this.enableOutputLogAlert.setSelected(Boolean.TRUE);
        } else {
            this.enableOutputLogAlert.setSelected(Boolean.FALSE);
        }
        this.enableOutputLogAlert.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setEnableOutputLogAlert(Boolean.TRUE);
                } else {
                    minifyProperty.setEnableOutputLogAlert(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });

        if (minifyProperty.isEnableShortKeyAction()) {
            this.enableShortKeyAction.setSelected(Boolean.TRUE);
            this.enableShortKeyActionConfirmBox.setEnabled(Boolean.TRUE);
//            this.enableShortKeyActionConfirmBox.setSelected(Boolean.TRUE);
//            minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.TRUE);
        } else {
            this.enableShortKeyAction.setSelected(Boolean.FALSE);
            this.enableShortKeyActionConfirmBox.setEnabled(Boolean.FALSE);
            this.enableShortKeyActionConfirmBox.setSelected(Boolean.FALSE);
            minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.FALSE);
        }
        this.enableShortKeyAction.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setEnableShortKeyAction(Boolean.TRUE);
                    enableShortKeyActionConfirmBox.setEnabled(Boolean.TRUE);
                    enableShortKeyActionConfirmBox.setSelected(Boolean.TRUE);
                    minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.TRUE);
                } else {
                    minifyProperty.setEnableShortKeyAction(Boolean.FALSE);
                    enableShortKeyActionConfirmBox.setEnabled(Boolean.FALSE);
                    enableShortKeyActionConfirmBox.setSelected(Boolean.FALSE);
                    minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });

        if (minifyProperty.isEnableShortKeyActionConfirmBox()) {
            this.enableShortKeyActionConfirmBox.setSelected(Boolean.TRUE);
        } else {
            this.enableShortKeyActionConfirmBox.setSelected(Boolean.FALSE);
        }
        this.enableShortKeyActionConfirmBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.TRUE);
                } else {
                    minifyProperty.setEnableShortKeyActionConfirmBox(Boolean.FALSE);
                }
                //minifyPropertyController.writeMinifyProperty(minifyProperty);
            }
        });
    }

    public static ProjectOptionsPanel create() {
        ProjectOptionsPanel panel = new ProjectOptionsPanel();

        return panel;
    }

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane8 = new javax.swing.JLayeredPane();
        addLogToFile = new javax.swing.JCheckBox();
        enableOutputLogAlert = new javax.swing.JCheckBox();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        enableShortKeyAction = new javax.swing.JCheckBox();
        enableShortKeyActionConfirmBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        separatBuild = new javax.swing.JCheckBox();
        buildJSMinify = new javax.swing.JCheckBox();
        buildCSSMinify = new javax.swing.JCheckBox();
        skipPreExtensionJS = new javax.swing.JCheckBox();
        skipPreExtensionCSS = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        buildHTMLMinify = new javax.swing.JCheckBox();
        skipPreExtensionHTML = new javax.swing.JCheckBox();
        buildXMLMinify = new javax.swing.JCheckBox();
        skipPreExtensionXML = new javax.swing.JCheckBox();
        buildJSONMinify = new javax.swing.JCheckBox();
        skipPreExtensionJSON = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.jLayeredPane8.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        addLogToFile.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(addLogToFile, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.addLogToFile.text")); // NOI18N
        addLogToFile.setContentAreaFilled(false);
        jLayeredPane8.add(addLogToFile);
        addLogToFile.setBounds(10, 20, 280, 20);

        enableOutputLogAlert.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(enableOutputLogAlert, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.enableOutputLogAlert.text")); // NOI18N
        enableOutputLogAlert.setContentAreaFilled(false);
        jLayeredPane8.add(enableOutputLogAlert);
        enableOutputLogAlert.setBounds(10, 40, 390, 20);

        jLayeredPane10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.jLayeredPane10.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        enableShortKeyAction.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(enableShortKeyAction, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.enableShortKeyAction.text")); // NOI18N
        enableShortKeyAction.setContentAreaFilled(false);
        jLayeredPane10.add(enableShortKeyAction);
        enableShortKeyAction.setBounds(10, 20, 280, 20);

        enableShortKeyActionConfirmBox.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(enableShortKeyActionConfirmBox, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.enableShortKeyActionConfirmBox.text")); // NOI18N
        enableShortKeyActionConfirmBox.setContentAreaFilled(false);
        jLayeredPane10.add(enableShortKeyActionConfirmBox);
        enableShortKeyActionConfirmBox.setBounds(10, 40, 350, 20);

        separatBuild.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(separatBuild, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.separatBuild.text")); // NOI18N
        separatBuild.setActionCommand(org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.separatBuild.actionCommand")); // NOI18N
        separatBuild.setContentAreaFilled(false);

        buildJSMinify.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(buildJSMinify, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.buildJSMinify.text")); // NOI18N
        buildJSMinify.setContentAreaFilled(false);

        buildCSSMinify.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(buildCSSMinify, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.buildCSSMinify.text")); // NOI18N
        buildCSSMinify.setContentAreaFilled(false);

        skipPreExtensionJS.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(skipPreExtensionJS, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.skipPreExtensionJS.text")); // NOI18N
        skipPreExtensionJS.setContentAreaFilled(false);

        skipPreExtensionCSS.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(skipPreExtensionCSS, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.skipPreExtensionCSS.text")); // NOI18N
        skipPreExtensionCSS.setContentAreaFilled(false);

        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.jLabel6.text")); // NOI18N

        buildHTMLMinify.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(buildHTMLMinify, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.buildHTMLMinify.text")); // NOI18N
        buildHTMLMinify.setContentAreaFilled(false);

        skipPreExtensionHTML.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(skipPreExtensionHTML, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.skipPreExtensionHTML.text")); // NOI18N
        skipPreExtensionHTML.setContentAreaFilled(false);

        buildXMLMinify.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(buildXMLMinify, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.buildXMLMinify.text")); // NOI18N
        buildXMLMinify.setContentAreaFilled(false);

        skipPreExtensionXML.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(skipPreExtensionXML, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.skipPreExtensionXML.text")); // NOI18N
        skipPreExtensionXML.setContentAreaFilled(false);

        buildJSONMinify.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(buildJSONMinify, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.buildJSONMinify.text")); // NOI18N
        buildJSONMinify.setContentAreaFilled(false);

        skipPreExtensionJSON.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(skipPreExtensionJSON, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.skipPreExtensionJSON.text")); // NOI18N
        skipPreExtensionJSON.setContentAreaFilled(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ProjectOptionsPanel.class, "ProjectOptionsPanel.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(separatBuild)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buildXMLMinify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buildHTMLMinify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buildCSSMinify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buildJSMinify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(buildJSONMinify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(skipPreExtensionCSS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skipPreExtensionHTML, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skipPreExtensionXML, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skipPreExtensionJSON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(skipPreExtensionJS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(separatBuild)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipPreExtensionJS)
                    .addComponent(buildJSMinify))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipPreExtensionCSS)
                    .addComponent(buildCSSMinify))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipPreExtensionHTML)
                    .addComponent(buildHTMLMinify))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipPreExtensionXML)
                    .addComponent(buildXMLMinify))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipPreExtensionJSON)
                    .addComponent(buildJSONMinify))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLayeredPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(jLayeredPane10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JCheckBox addLogToFile;
    public javax.swing.JCheckBox buildCSSMinify;
    public javax.swing.JCheckBox buildHTMLMinify;
    public javax.swing.JCheckBox buildJSMinify;
    public javax.swing.JCheckBox buildJSONMinify;
    public javax.swing.JCheckBox buildXMLMinify;
    public javax.swing.JCheckBox enableOutputLogAlert;
    public javax.swing.JCheckBox enableShortKeyAction;
    public javax.swing.JCheckBox enableShortKeyActionConfirmBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JCheckBox separatBuild;
    public javax.swing.JCheckBox skipPreExtensionCSS;
    public javax.swing.JCheckBox skipPreExtensionHTML;
    public javax.swing.JCheckBox skipPreExtensionJS;
    public javax.swing.JCheckBox skipPreExtensionJSON;
    public javax.swing.JCheckBox skipPreExtensionXML;
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
