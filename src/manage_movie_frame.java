
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;




public class manage_movie_frame extends javax.swing.JFrame {

    ArrayList<MovieClass> al = new ArrayList<>();
    mytablemodel tm;
    File f1, f2, f3;

    
    public manage_movie_frame() {
        initComponents();
        al = new ArrayList<>();
        tm = new mytablemodel();
        Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d.getSize());
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        getCategories();
        jTable1.setModel(tm);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        tf1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setText("ADD MOVIE HERE");
        getContentPane().add(lb1);
        lb1.setBounds(110, 10, 150, 16);

        lb2.setText("CATEGORY");
        getContentPane().add(lb2);
        lb2.setBounds(40, 60, 100, 16);

        lb3.setText("MOVIE");
        getContentPane().add(lb3);
        lb3.setBounds(40, 110, 36, 16);

        lb4.setText("DESCRIPTION");
        getContentPane().add(lb4);
        lb4.setBounds(40, 160, 73, 16);

        lb5.setText("SQUARE PHOTO");
        getContentPane().add(lb5);
        lb5.setBounds(40, 220, 87, 16);

        lb6.setText("WIDE PHOTO");
        getContentPane().add(lb6);
        lb6.setBounds(40, 270, 72, 16);

        lb7.setText("VIDEO");
        getContentPane().add(lb7);
        lb7.setBounds(40, 330, 34, 16);

        lb8.setText("AMOUNT");
        getContentPane().add(lb8);
        lb8.setBounds(40, 390, 50, 16);

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb);
        cb.setBounds(170, 60, 200, 22);

        tf1.setText("jTextField1");
        getContentPane().add(tf1);
        tf1.setBounds(170, 110, 200, 22);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 140, 230, 60);

        lb9.setText("jLabel9");
        getContentPane().add(lb9);
        lb9.setBounds(170, 216, 210, 30);

        lb10.setText("jLabel10");
        getContentPane().add(lb10);
        lb10.setBounds(170, 270, 45, 16);

        lb11.setText("jLabel11");
        getContentPane().add(lb11);
        lb11.setBounds(170, 330, 45, 16);

        tf2.setText("jTextField2");
        getContentPane().add(tf2);
        tf2.setBounds(170, 390, 220, 22);

        bt1.setText("Browse");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(30, 240, 72, 22);

        bt2.setText("Browse");
        getContentPane().add(bt2);
        bt2.setBounds(30, 290, 72, 22);

        bt3.setText("Browse");
        getContentPane().add(bt3);
        bt3.setBounds(30, 360, 72, 22);

        bt4.setText("ADD MOVIE");
        getContentPane().add(bt4);
        bt4.setBounds(150, 450, 210, 22);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(7, 60, 30, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     

    class mytablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public String getColumnName(int j) {
            String c[] = {"category", "movie_name", "description", "square_photo", "wide_photo", "sample_video", "amount"};
            return c[j];
        }

        @Override
        public Object getValueAt(int i, int j) {
            MovieClass st = al.get(i);

            if (j == 0)
            {
                return st.movieid;
            } else if (j == 1) {
                return st.movie_name;
            } else if (j == 2) {
                return st.description;
            } else if (j == 3) {
                return st.square_photo;
            } else if (j == 4) {
                return st.wide_photo;
            } else if (j == 5) {
                return st.sample_photo1;
            } else {
                return st.amount1;
            }
        }

    }
    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
         JFileChooser chooser = new JFileChooser();
        int ans = chooser.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            f1 = chooser.getSelectedFile();
        }
        ImageIcon icon = new ImageIcon(f1.getPath());
        Image img = icon.getImage().getScaledInstance(lb9.getWidth(), lb9.getHeight(), Image.SCALE_SMOOTH);
        lb9.setIcon(new ImageIcon(img));

    }                                   

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //get all data
        String cat = cb.getSelectedItem().toString();

        String mn = tf1.getText();
        String desc = ta.getText();
        String amt = tf2.getText();
        if (cat.isEmpty() || mn.isEmpty() || desc.isEmpty() || f1 == null || f2 == null || f3 == null || amt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are reqiured...");
        } else {
            try {
                HttpResponse<String> res = Unirest.post("http://localhost:9000/addmovie")
                        .queryString("category", cat)
                        .queryString("movie_name", mn)
                        .queryString("description", desc)
                        .queryString("amount", amt)
                        .field("square_photo", f1)
                        .field("wide_photo", f2)
                        .field("sample_video", f3)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    System.out.println("-----------------" + ans);
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "Movie Added Successfully");
                        getCategories();
                    } else {
                        JOptionPane.showMessageDialog(this, "Movie Already Exists...");
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }                                   

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        JFileChooser chooser = new JFileChooser();
        int ans = chooser.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            f2 = chooser.getSelectedFile();
        }
        ImageIcon icon = new ImageIcon(f2.getPath());
        Image img = icon.getImage().getScaledInstance(lb10.getWidth(), lb10.getHeight(), Image.SCALE_SMOOTH);
        lb10.setIcon(new ImageIcon(img));
    }                                   

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        JFileChooser chooser = new JFileChooser();
        int ans = chooser.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            f3 = chooser.getSelectedFile();
        }
//        ImageIcon icon = new ImageIcon(f3.getPath());
//        Image img = icon.getImage().getScaledInstance(bt3.getWidth(), bt3.getHeight(), Image.SCALE_SMOOTH);
//        bt3.setIcon(new ImageIcon(img));
        lb11.setText(f3.getPath());
    }                                   

    /**
     * @param args the command line arguments
     */
    public void getCategories() {
        //send Unirest get request on server and fetch all categories  from database
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:9000/getAllMovies")
                    .asString();

            if (res.getStatus() == 200) {
                String ans = res.getBody();
                StringTokenizer st = new StringTokenizer(ans, "#*#");
                while (st.hasMoreTokens()) {
                    String movieDetails = st.nextToken();
                    System.out.println("categoryDetails   " + movieDetails);
                    StringTokenizer st2 = new StringTokenizer(movieDetails, "**");
                    String movieid = st2.nextToken();

                    String movieName = st2.nextToken();
                    String description = st2.nextToken();
                    String squarePhoto = st2.nextToken();
                    String wide_photo = st2.nextToken();
                    String sample_video = st2.nextToken();
                    String amount = st2.nextToken();
                    MovieClass obj = new MovieClass(movieid, description, squarePhoto, wide_photo, sample_video, amount, movieName);
                    al.add(obj);
                }
            }
            tm.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt1ActionPerformed

    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manage_movie_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_movie_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_movie_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_movie_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_movie_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
