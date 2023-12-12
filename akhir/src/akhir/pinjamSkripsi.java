/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package akhir;


import presisttt.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import presisttt.PinjamSkripsi;

/**
 *
 * @author Irkhamnawan
 */
public class pinjamSkripsi extends javax.swing.JPanel {

    /**
     * Creates new form bukuu
     */
    
    ArrayList<PinjamSkripsi> dataPinjamskripsi;
    boolean sm = true;
    public pinjamSkripsi() {
        initComponents();
        tampilkan();
    }
    
    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT p FROM PinjamSkripsi p");
        List<PinjamSkripsi> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.setRowCount(0);
        for(PinjamSkripsi ps : results){
            Object[] ob = new Object[5];
            ob[0] = ps.getIdPinjam();
            ob[1] = ps.getIdMahasiswa().getIdMahasiswa();
            ob[2] = ps.getIdSkripsi().getIdSkripsi();
            ob[3] = ps.getTanggal();
            ob[4] = ps.getStatus();
            tbl.addRow(ob);
        }
        entityManager.close();        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Peminjaman", "ID Mahasiswa", "ID Skripsi", "Tanggal", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("INPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("MAX");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Peminjaman", "ID Mahasiswa", "ID Skripsi", "Tanggal", "Status" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addGap(40, 40, 40)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inputPinjamskripsi ips = new inputPinjamskripsi(jTable1);
        ips.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();
            PinjamSkripsi ps = entityManager.find(PinjamSkripsi.class, s);
        entityManager.getTransaction().commit();        
        inputPinjamskripsi ips = new inputPinjamskripsi(ps,jTable1);
        ips.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menghapus data?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        	entityManager.getTransaction().begin();
                	PinjamSkripsi k = entityManager.find(PinjamSkripsi.class, s);
                	entityManager.remove(k);
                entityManager.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                tampilkan();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();

        int row = jTable1.getSelectedRow();
        String tabel_klik = (jTable1.getModel().getValueAt(row, 0).toString());

    // Ubah kode di bawah ini untuk mencari data yang diinginkan
    PinjamSkripsi ps = entityManager.find(PinjamSkripsi.class, tabel_klik);
    if (ps != null) {
        String idPinjam = ps.getIdPinjam();
        String idMahasiswa = ps.getIdMahasiswa().getIdMahasiswa();
        String idSkripsi = ps.getIdSkripsi().getIdSkripsi();
        String tanggal = ps.getTanggal();
        String status = ps.getStatus();
    }

    entityManager.getTransaction().commit();
} catch (Exception e) {
    // Handle exceptions appropriately
}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String reportPath = "src/akhir/reportPnjB.jrxml";
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("akhirPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PinjamSkripsi> cq = cb.createQuery (PinjamSkripsi.class);
        Root<PinjamSkripsi> bok = cq.from(PinjamSkripsi.class);
        cq.select(bok);
        
        TypedQuery<PinjamSkripsi> q = em.createQuery(cq);
        List<PinjamSkripsi> list = q.getResultList();
        Query query = em.createQuery("SELECT p FROM PinjamSkripsi p");
        List<PinjamSkripsi> result = query.getResultList();
        
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource (result);
        
        
        try {
            // TODO add your handling code here:
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, dataSource);
            JasperViewer vw = new JasperViewer (jp, false);
            vw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(PinjamSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            String selection = (String) jComboBox2.getSelectedItem();
            String searchTerm = jTextField1.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM PinjamSkripsi p WHERE ";

            switch (selection) {
                case "ID Peminjaman":
                    queryString += "LOWER(p.idPinjam) LIKE LOWER(:searchTerm)";
                    break;
                case "ID Mahasiswa":
                    queryString += "LOWER(p.idMahasiswa) LIKE LOWER(:searchTerm)";
                    break;
                case "ID SKripsi":
                    queryString += "LOWER(p.idSkripsi) LIKE LOWER(:searchTerm)";
                    break;
                case "Tanggal":
                    queryString += "LOWER(p.tanggal) LIKE LOWER(:searchTerm)";
                    break;
                case "Status":
                    queryString += "LOWER(p.status) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("akhirPU");
            EntityManager em = emf.createEntityManager();

            TypedQuery<PinjamSkripsi> query = em.createQuery(queryString, PinjamSkripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<PinjamSkripsi> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ID Peminjaman");
            dataModel.addColumn("ID Mahasiswa");
            dataModel.addColumn("ID Skripsi");
            dataModel.addColumn("Tanggal");
            dataModel.addColumn("Status");

            // Add rows to the model
            for (PinjamSkripsi result : results) {
                Object[] rowData = {
                    result.getIdPinjam(),
                    result.getIdMahasiswa().getIdMahasiswa(),
                    result.getIdSkripsi().getIdSkripsi(),
                    result.getTanggal(),
                    result.getStatus()
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            jTable1.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String reportPath = "src/akhir/reportPnjS.jrxml";

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("akhirPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class); // Use Object[] for multiple selected columns
        Root<PinjamSkripsi> bok = cq.from(PinjamSkripsi.class);
        cq.multiselect(bok.get("idSkripsi"), cb.count(bok)); // Select ISBN and count
        cq.groupBy(bok.get("idSkripsi"));
        cq.orderBy(cb.desc(cb.count(bok)));

        TypedQuery<Object[]> q = em.createQuery(cq);
        List<Object[]> result = q.getResultList();

// Get the ISBN from the result
        List<String> mostFrequentIdSkripsiList = new ArrayList<>();
        for (Object[] row : result) {
            mostFrequentIdSkripsiList.add((String) row[0]);
        }

// Now you can use the ISBN list to fetch the corresponding books
        CriteriaQuery<PinjamSkripsi> bookCq = cb.createQuery(PinjamSkripsi.class);
        Root<PinjamSkripsi> bookRoot = bookCq.from(PinjamSkripsi.class);
        bookCq.select(bookRoot);
        bookCq.where(bookRoot.get("idSkripsi").in(mostFrequentIdSkripsiList));

        TypedQuery<PinjamSkripsi> bookQuery = em.createQuery(bookCq);
        List<PinjamSkripsi> books = bookQuery.getResultList();

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(books);

        try {
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, dataSource);
            JasperViewer vw = new JasperViewer(jp, false);
            vw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(PinjamSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
