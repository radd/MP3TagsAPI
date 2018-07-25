package io.github.radd;

import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Piotr
 */
public class MainWindow extends javax.swing.JFrame {


    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        chooseFilesBtn = new javax.swing.JButton();
        chooseFilesLabel = new javax.swing.JLabel();
        fileListScrollPane = new javax.swing.JScrollPane();
        fileList = new javax.swing.JList<>();
        fileListLabel = new javax.swing.JLabel();
        fileScrollPane = new javax.swing.JScrollPane();
        filePaneLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseFilesBtn.setText("Choose files");
        chooseFilesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseFilesBtnMouseClicked(evt);
            }
        });

        chooseFilesLabel.setText("Load files from disc:");

        fileListHeaderLabel = new JLabel(" No file");
        fileListScrollPane.setColumnHeaderView(fileListHeaderLabel);

        model = new DefaultListModel();
        fileList.setModel(model);
        fileList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fileList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileListMouseClicked(evt);
            }
        });
        fileListScrollPane.setViewportView(fileList);

        fileListLabel.setText("MP3 files:");

        fileHeaderLabel = new JLabel(FILE_HEADER_TEXT);
        fileScrollPane.setColumnHeaderView(fileHeaderLabel);

        filePaneLabel.setText("File info:");

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chooseFilesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooseFilesBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileListLabel))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filePaneLabel)
                            .addComponent(fileScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFilesBtn)
                    .addComponent(chooseFilesLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileListLabel)
                    .addComponent(filePaneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileScrollPane)
                    .addComponent(fileListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileListMouseClicked
        JList fileList = (JList)evt.getSource();
	System.out.println(" " + fileList.getSelectedIndex());
        setFilePaneHeader(" " + files[fileList.getSelectedIndex()].getName());

        
        //System.err.println("clicked");
    }//GEN-LAST:event_fileListMouseClicked

    private void chooseFilesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFilesBtnMouseClicked
        JFileChooser chooser = new JFileChooser("D:\\Woles109\\MP3");
	FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3");
	chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            files= chooser.getSelectedFiles();
            fileListHeaderLabel.setText(" " + files.length + " files");
            setFilePaneHeader(FILE_HEADER_TEXT);
            
            model.removeAllElements();
            for(File file : files) {
                model.addElement(file.getName());

            }
        }    
    }//GEN-LAST:event_chooseFilesBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFilesBtn;
    private javax.swing.JLabel chooseFilesLabel;
    private javax.swing.JList<String> fileList;
    private javax.swing.JLabel fileListLabel;
    private javax.swing.JScrollPane fileListScrollPane;
    private JLabel fileListHeaderLabel;
    private javax.swing.JLabel filePaneLabel;
    private javax.swing.JScrollPane fileScrollPane;
    private JLabel fileHeaderLabel;
    private final String FILE_HEADER_TEXT = " Select a file...";
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    private File[] files = null;
    private DefaultListModel model;

  
    private void setFilePaneHeader(String text) {
        fileHeaderLabel.setText(text);
    }
}
