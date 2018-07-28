/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.radd;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.ID3v24Tag;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Piotr
 */
public class FilePanel extends javax.swing.JPanel {

    /**
     * Creates new form FilePanel
     */
    public FilePanel() {
        initComponents();
        showCoverBtn.setEnabled(false);
        editCoverBtn.setVisible(false);
        editCoverText.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        artistText = new javax.swing.JTextField();
        albumText = new javax.swing.JTextField();
        titleText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        genreText = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        fileNameText = new javax.swing.JTextField();
        urlText = new javax.swing.JTextField();
        filename = new javax.swing.JTextField();
        encoder = new javax.swing.JTextField();
        album = new javax.swing.JTextField();
        artist = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        copyrightText = new javax.swing.JTextField();
        albumArtistText = new javax.swing.JTextField();
        originalArtistText = new javax.swing.JTextField();
        publisherText = new javax.swing.JTextField();
        encoderText = new javax.swing.JTextField();
        composerText = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        copyright = new javax.swing.JTextField();
        albumArtist = new javax.swing.JTextField();
        originalArtist = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        composer = new javax.swing.JTextField();
        bitRateText = new javax.swing.JTextField();
        lengthText = new javax.swing.JTextField();
        length = new javax.swing.JTextField();
        bitRate = new javax.swing.JTextField();
        sizeText = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        coverText = new javax.swing.JTextField();
        coverContainer = new javax.swing.JPanel();
        showCoverBtn = new javax.swing.JButton();
        editCoverBtn = new javax.swing.JButton();
        editCoverText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 12, 0, 12, 0};
        layout.rowHeights = new int[] {0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0};
        setLayout(layout);

        artistText.setEditable(false);
        artistText.setText("Artist:");
        artistText.setBorder(null);
        artistText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(artistText, gridBagConstraints);

        albumText.setEditable(false);
        albumText.setText("Album:");
        albumText.setBorder(null);
        albumText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(albumText, gridBagConstraints);

        titleText.setEditable(false);
        titleText.setText("Title:");
        titleText.setBorder(null);
        titleText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(titleText, gridBagConstraints);

        yearText.setEditable(false);
        yearText.setText("Year:");
        yearText.setBorder(null);
        yearText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(yearText, gridBagConstraints);

        genreText.setEditable(false);
        genreText.setText("Genre:");
        genreText.setBorder(null);
        genreText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(genreText, gridBagConstraints);

        title.setEditable(false);
        title.setBorder(null);
        title.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(title, gridBagConstraints);

        fileNameText.setEditable(false);
        fileNameText.setText("Filename:");
        fileNameText.setBorder(null);
        fileNameText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(fileNameText, gridBagConstraints);

        urlText.setEditable(false);
        urlText.setText("URL:");
        urlText.setBorder(null);
        urlText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(urlText, gridBagConstraints);

        filename.setEditable(false);
        filename.setBorder(null);
        filename.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(filename, gridBagConstraints);

        encoder.setEditable(false);
        encoder.setBorder(null);
        encoder.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(encoder, gridBagConstraints);

        album.setEditable(false);
        album.setBorder(null);
        album.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(album, gridBagConstraints);

        artist.setEditable(false);
        artist.setBorder(null);
        artist.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(artist, gridBagConstraints);

        year.setEditable(false);
        year.setBorder(null);
        year.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(year, gridBagConstraints);

        genre.setEditable(false);
        genre.setBorder(null);
        genre.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(genre, gridBagConstraints);

        copyrightText.setEditable(false);
        copyrightText.setText("Copyright:");
        copyrightText.setBorder(null);
        copyrightText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(copyrightText, gridBagConstraints);

        albumArtistText.setEditable(false);
        albumArtistText.setText("Album artist:");
        albumArtistText.setBorder(null);
        albumArtistText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(albumArtistText, gridBagConstraints);

        originalArtistText.setEditable(false);
        originalArtistText.setText("Original artist:");
        originalArtistText.setBorder(null);
        originalArtistText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(originalArtistText, gridBagConstraints);

        publisherText.setEditable(false);
        publisherText.setText("Publisher:");
        publisherText.setBorder(null);
        publisherText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(publisherText, gridBagConstraints);

        encoderText.setEditable(false);
        encoderText.setText("Encoder:");
        encoderText.setBorder(null);
        encoderText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(encoderText, gridBagConstraints);

        composerText.setEditable(false);
        composerText.setText("Composer:");
        composerText.setBorder(null);
        composerText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(composerText, gridBagConstraints);

        url.setEditable(false);
        url.setBorder(null);
        url.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(url, gridBagConstraints);

        copyright.setEditable(false);
        copyright.setBorder(null);
        copyright.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(copyright, gridBagConstraints);

        albumArtist.setEditable(false);
        albumArtist.setBorder(null);
        albumArtist.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(albumArtist, gridBagConstraints);

        originalArtist.setEditable(false);
        originalArtist.setBorder(null);
        originalArtist.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(originalArtist, gridBagConstraints);

        publisher.setEditable(false);
        publisher.setBorder(null);
        publisher.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(publisher, gridBagConstraints);

        composer.setEditable(false);
        composer.setBorder(null);
        composer.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(composer, gridBagConstraints);

        bitRateText.setEditable(false);
        bitRateText.setText("Bit rate:");
        bitRateText.setBorder(null);
        bitRateText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(bitRateText, gridBagConstraints);

        lengthText.setEditable(false);
        lengthText.setText("Length:");
        lengthText.setBorder(null);
        lengthText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(lengthText, gridBagConstraints);

        length.setEditable(false);
        length.setBorder(null);
        length.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(length, gridBagConstraints);

        bitRate.setEditable(false);
        bitRate.setBorder(null);
        bitRate.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(bitRate, gridBagConstraints);

        sizeText.setEditable(false);
        sizeText.setText("File size:");
        sizeText.setBorder(null);
        sizeText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(sizeText, gridBagConstraints);

        size.setEditable(false);
        size.setBorder(null);
        size.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(size, gridBagConstraints);

        coverText.setEditable(false);
        coverText.setText("Cover:");
        coverText.setBorder(null);
        coverText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(coverText, gridBagConstraints);

        coverContainer.setBackground(new java.awt.Color(255, 255, 255));
        coverContainer.setAlignmentX(0.0F);
        coverContainer.setAlignmentY(0.0F);
        coverContainer.setOpaque(false);

        showCoverBtn.setText("Show cover");
        showCoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCoverBtnActionPerformed(evt);
            }
        });
        coverContainer.add(showCoverBtn);

        editCoverBtn.setText("Edit cover");
        coverContainer.add(editCoverBtn);

        editCoverText.setEditable(false);
        editCoverText.setText("File: ");
        editCoverText.setBorder(null);
        editCoverText.setOpaque(false);
        coverContainer.add(editCoverText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(coverContainer, gridBagConstraints);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void showCoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCoverBtnActionPerformed
        setCover();
    }//GEN-LAST:event_showCoverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField album;
    private javax.swing.JTextField albumArtist;
    private javax.swing.JTextField albumArtistText;
    private javax.swing.JTextField albumText;
    private javax.swing.JTextField artist;
    private javax.swing.JTextField artistText;
    private javax.swing.JTextField bitRate;
    private javax.swing.JTextField bitRateText;
    private javax.swing.JTextField composer;
    private javax.swing.JTextField composerText;
    private javax.swing.JTextField copyright;
    private javax.swing.JTextField copyrightText;
    private javax.swing.JPanel coverContainer;
    private javax.swing.JTextField coverText;
    private javax.swing.JButton editCoverBtn;
    private javax.swing.JTextField editCoverText;
    private javax.swing.JTextField encoder;
    private javax.swing.JTextField encoderText;
    private javax.swing.JTextField fileNameText;
    private javax.swing.JTextField filename;
    private javax.swing.JTextField genre;
    private javax.swing.JTextField genreText;
    private javax.swing.JTextField length;
    private javax.swing.JTextField lengthText;
    private javax.swing.JTextField originalArtist;
    private javax.swing.JTextField originalArtistText;
    private javax.swing.JTextField publisher;
    private javax.swing.JTextField publisherText;
    private javax.swing.JButton showCoverBtn;
    private javax.swing.JTextField size;
    private javax.swing.JTextField sizeText;
    private javax.swing.JTextField title;
    private javax.swing.JTextField titleText;
    private javax.swing.JTextField url;
    private javax.swing.JTextField urlText;
    private javax.swing.JTextField year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables

    private Mp3File mp3file;
    private boolean editable;
    private int id;

    public void setFile(File file, int index) {
        try {
            mp3file = new Mp3File(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }

        id = index;
        if (editable) {
            enableEdit(false);
        }
        setInfo();
    }

    private void setInfo() {
        if (mp3file != null && mp3file.hasId3v2Tag()) {
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();

            filename.setText(getFilename(mp3file.getFilename()));
            size.setText(getFileSize());
            length.setText(formatSeconds(mp3file.getLengthInSeconds()));
            bitRate.setText(mp3file.getBitrate() + " kbps");
            title.setText(id3v2Tag.getTitle());
            artist.setText(id3v2Tag.getArtist());
            album.setText(id3v2Tag.getAlbum());
            year.setText(id3v2Tag.getYear());
            genre.setText(id3v2Tag.getGenreDescription());
            composer.setText(id3v2Tag.getComposer());
            publisher.setText(id3v2Tag.getPublisher());
            originalArtist.setText(id3v2Tag.getOriginalArtist());
            albumArtist.setText(id3v2Tag.getAlbumArtist());
            copyright.setText(id3v2Tag.getCopyright());
            url.setText(id3v2Tag.getUrl());
            encoder.setText(id3v2Tag.getEncoder());
            
            //has cover
            showCoverBtn.setEnabled((id3v2Tag.getAlbumImage() != null));
        }
    }

    private String formatSeconds(long seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        
        String format = "%02d:%02d:%02d";
        if(hours == 0)
            format = "%02d:%02d";
        
        return String.format(format, minutes, seconds);
    }

    private String getFileSize() {
        File file = new File(mp3file.getFilename());
        return formatBytes(file.length());
    }
    
    private String formatBytes(long bytes) {
        if(bytes < 1024)
            return bytes + " B";
        
        long mb = bytes / (1024 * 1024);
        if(mb == 0) //only kilobytes
            return String.format("%3d KB", bytes / 1024);
               
        double kb = (double) bytes % (1024 * 1024) / 1024 / 1024; //fraction for binary convert i.e. 0.7 (7 - binary ratio)
        if(kb == 0)
            return mb + " MB";
        
//        if(kb >= 0.95)
//            return (mb + 1) + " MB";
        
        kb += mb; //fraction plus total
        return String.format("%.1f MB", kb);
    }
    
    private String getFilename(String fileFullPath) {
        String filename = getFullFilename(fileFullPath);

        if (filename.indexOf(".") > 0) {
            return filename.substring(0, filename.lastIndexOf("."));
        } else {
            return filename;
        }
    }

    public String getFullFilename(String fileFullPath) {
        Path p = Paths.get(fileFullPath);
        return p.getFileName().toString();
    }

    public String getFullFilename() {
        Path p = Paths.get(mp3file.getFilename());
        return p.getFileName().toString();
    }

    public String getFilePath() {
        return mp3file.getFilename();
    }

    public int getId() {
        return id;
    }

    public void enableEdit(boolean b) {
        editable = b;

        toggleEditTextField(filename, b);
        toggleEditTextField(title, b);
        toggleEditTextField(artist, b);
        toggleEditTextField(album, b);
        toggleEditTextField(year, b);
        //toggleEditTextField(genre, b);
        toggleEditTextField(composer, b);
        toggleEditTextField(publisher, b);
        toggleEditTextField(originalArtist, b);
        toggleEditTextField(albumArtist, b);
        toggleEditTextField(copyright, b);
        toggleEditTextField(url, b);
        toggleEditTextField(encoder, b);

        if (!b) {
            setInfo();
        }

        revalidate();
        repaint();

    }

    private void toggleEditTextField(JTextField f, boolean b) {
        if (b) {
            f.setEditable(b);
            f.setColumns(50);
            f.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        } else {
            f.setEditable(b);
            f.setColumns(0);
            f.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        }
    }

    public void saveFile() {
        if (mp3file != null) {
            String path = null;
            try {
                File newFile = backUpFile();
                deleteCurrFile();
                Mp3File mp3f = new Mp3File(newFile);
                saveId3v2Tags(mp3f);
                path = saveMP3File(mp3f);

            } catch (IOException ex) {
                System.out.println("File save failed. Msg: " + ex.getMessage());
            } catch (NotSupportedException ex) {
                Logger.getLogger(FilePanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedTagException ex) {
                Logger.getLogger(FilePanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidDataException ex) {
                Logger.getLogger(FilePanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (path != null) {
                setFile(new File(path), id);
            }

        }
    }

    private File backUpFile() throws IOException {
        String path = System.getProperty("user.home") + File.separator + "MP3Tags_backup";
        File dir = new File(path);
        if (dir.exists() || dir.mkdirs()) {
            File source = new File(mp3file.getFilename());
            File dest = new File(dir.getAbsolutePath() + File.separator + getFilename(mp3file.getFilename()) + "_backup_" + System.currentTimeMillis() + ".mp3");
            Files.copy(source.toPath(), dest.toPath());
            return dest;
        } else {
            throw new IOException("Folder not exist");
        }
    }

    private void deleteCurrFile() throws IOException {
        File file = new File(mp3file.getFilename());
        if (!file.delete()) {
            throw new IOException("Failed to delete the file");
        }
    }

    private void saveId3v2Tags(Mp3File mp3f) {
        ID3v2 id3v2Tag;
        if (mp3f.hasId3v2Tag()) {
            id3v2Tag = mp3f.getId3v2Tag();
        } else {
            // mp3 does not have an ID3v2 tag, let's create one..
            id3v2Tag = new ID3v24Tag();
            mp3f.setId3v2Tag(id3v2Tag);
        }

        saveTags(id3v2Tag);
    }

    private void saveTags(ID3v2 id3v2Tag) {
        id3v2Tag.setTitle(title.getText());
        id3v2Tag.setArtist(artist.getText());
        id3v2Tag.setAlbum(album.getText());
        id3v2Tag.setYear(year.getText());
        //id3v2Tag.setGenreDescription(genre.getText());       
        id3v2Tag.setComposer(composer.getText());
        id3v2Tag.setPublisher(publisher.getText());
        id3v2Tag.setOriginalArtist(originalArtist.getText());
        id3v2Tag.setAlbumArtist(albumArtist.getText());
        id3v2Tag.setCopyright(copyright.getText());
        id3v2Tag.setUrl(url.getText());
        id3v2Tag.setEncoder(encoder.getText());
    }

    private String saveMP3File(Mp3File mp3f) throws IOException, NotSupportedException {
        String newFilename = filename.getText(); // check valid
        Path p = Paths.get(mp3file.getFilename());
        String fileRoot = p.getParent().toString();
        String path = fileRoot + File.separator + newFilename + ".mp3";
        mp3f.save(path);
        return path;
    }
    
    private void setCover() {
        ID3v2 id3v2Tag = mp3file.getId3v2Tag();
        
        byte[] imageData = id3v2Tag.getAlbumImage();
        
        BufferedImage img = null;
        if (imageData != null) {
            try {
                img = ImageIO.read(new ByteArrayInputStream(imageData));
            } catch (IOException ex) {
                Logger.getLogger(FilePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(img != null)
                openCover(img);
        }        
    }

    private void openCover(Image img) {    
        Image newImage;
        newImage = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        
        img.flush();
        img = null;
        
        CoverFrame cover = new CoverFrame(newImage);
        cover.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cover.pack();
        cover.setVisible(true);
        
    }
    
}
