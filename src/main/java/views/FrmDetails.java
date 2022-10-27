package views;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.Category;
import models.Product;
import services.CategoryService;
import services.ICategoryService;
import services.IProductService;
import services.ProductService;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class FrmDetails extends javax.swing.JFrame {

    private ICategoryService iCategoryService;
    private IProductService iProductService;
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel<Category> defaultComboBoxModel;

    public FrmDetails() {
        initComponents();
        setLocationRelativeTo(null);
        defaultComboBoxModel = new DefaultComboBoxModel<>();
        iCategoryService = new CategoryService();
        iProductService = new ProductService();
        loadDataProduct(iProductService.getAll());
        loadDataCate(iCategoryService.getAll());
        addCombo();
    }

    private void addCombo() {
        cb_pro_danhmuc.setModel((DefaultComboBoxModel) defaultComboBoxModel);
        cb_pro_danhmuc.removeAllItems();
        for (Category x : iCategoryService.getAll()) {
            defaultComboBoxModel.addElement(x);
        }
    }

    private void loadDataProduct(List<Product> list) {
        defaultTableModel = (DefaultTableModel) tb_product.getModel();
        defaultTableModel.setRowCount(0);
        for (Product x : list) {
            defaultTableModel.addRow(new Object[]{
                x.getMa(), x.getTen(), x.getSoLuong(), x.getDonGia(), x.getCategory().getTen()
            });
        }
    }

    private void loadDataCate(List<Category> list) {
        defaultTableModel = (DefaultTableModel) tb_category.getModel();
        defaultTableModel.setRowCount(0);
        for (Category x : list) {
            defaultTableModel.addRow(new Object[]{
                x.getMa(), x.getTen()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_category = new javax.swing.JTable();
        txt_cate_ma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_cate_ten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cate_search = new javax.swing.JTextField();
        btn_cate_them = new javax.swing.JButton();
        btn_cate_xoa = new javax.swing.JButton();
        btn_cate_capnhat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_product = new javax.swing.JTable();
        txt_pro_ma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pro_ten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sp_pro_soluong = new javax.swing.JSpinner();
        txt_pro_dongia = new javax.swing.JTextField();
        txt_pro_search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_pro_them = new javax.swing.JButton();
        btn_pro_xoa = new javax.swing.JButton();
        btn_pro_capnhat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cb_pro_danhmuc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hi");

        tb_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên"
            }
        ));
        jScrollPane2.setViewportView(tb_category);
        if (tb_category.getColumnModel().getColumnCount() > 0) {
            tb_category.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setText("Mã");

        jLabel3.setText("Tên");

        jLabel4.setText("Search");

        txt_cate_search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_cate_searchCaretUpdate(evt);
            }
        });

        btn_cate_them.setBackground(new java.awt.Color(204, 204, 204));
        btn_cate_them.setText("Thêm");
        btn_cate_them.setBorderPainted(false);
        btn_cate_them.setFocusPainted(false);

        btn_cate_xoa.setBackground(new java.awt.Color(204, 204, 204));
        btn_cate_xoa.setText("Xóa");
        btn_cate_xoa.setBorderPainted(false);
        btn_cate_xoa.setFocusPainted(false);

        btn_cate_capnhat.setBackground(new java.awt.Color(204, 204, 204));
        btn_cate_capnhat.setText("Cập nhật");
        btn_cate_capnhat.setBorderPainted(false);
        btn_cate_capnhat.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cate_ten))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cate_search))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cate_ma))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_cate_them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cate_xoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btn_cate_capnhat)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cate_capnhat, btn_cate_them, btn_cate_xoa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cate_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cate_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cate_them)
                    .addComponent(btn_cate_xoa)
                    .addComponent(btn_cate_capnhat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cate_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tb_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Số lượng", "Đơn giá", "Danh mục"
            }
        ));
        jScrollPane1.setViewportView(tb_product);

        jLabel6.setText("Tên");

        jLabel5.setText("Mã");

        jLabel7.setText("Số lượng");

        jLabel8.setText("Đơn giá");

        txt_pro_search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_pro_searchCaretUpdate(evt);
            }
        });

        jLabel9.setText("Search");

        btn_pro_them.setBackground(new java.awt.Color(204, 204, 204));
        btn_pro_them.setText("Thêm");
        btn_pro_them.setBorderPainted(false);
        btn_pro_them.setFocusPainted(false);

        btn_pro_xoa.setBackground(new java.awt.Color(204, 204, 204));
        btn_pro_xoa.setText("Xóa");
        btn_pro_xoa.setBorderPainted(false);
        btn_pro_xoa.setFocusPainted(false);

        btn_pro_capnhat.setBackground(new java.awt.Color(204, 204, 204));
        btn_pro_capnhat.setText("Cập nhật");
        btn_pro_capnhat.setBorderPainted(false);
        btn_pro_capnhat.setFocusPainted(false);

        jLabel10.setText("Danh mục");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_pro_dongia)
                                    .addComponent(txt_pro_search)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(sp_pro_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_pro_danhmuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pro_ten))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pro_ma)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_pro_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_pro_them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_pro_capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pro_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_pro_them))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pro_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_pro_xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp_pro_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pro_capnhat)
                    .addComponent(jLabel10)
                    .addComponent(cb_pro_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_pro_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pro_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cate_searchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_cate_searchCaretUpdate
        loadDataCate(iCategoryService.search(txt_cate_search.getText()));
    }//GEN-LAST:event_txt_cate_searchCaretUpdate

    private void txt_pro_searchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_pro_searchCaretUpdate
        loadDataProduct(iProductService.search(txt_pro_search.getText()));
    }//GEN-LAST:event_txt_pro_searchCaretUpdate

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cate_capnhat;
    private javax.swing.JButton btn_cate_them;
    private javax.swing.JButton btn_cate_xoa;
    private javax.swing.JButton btn_pro_capnhat;
    private javax.swing.JButton btn_pro_them;
    private javax.swing.JButton btn_pro_xoa;
    private javax.swing.JComboBox<String> cb_pro_danhmuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner sp_pro_soluong;
    private javax.swing.JTable tb_category;
    private javax.swing.JTable tb_product;
    private javax.swing.JTextField txt_cate_ma;
    private javax.swing.JTextField txt_cate_search;
    private javax.swing.JTextField txt_cate_ten;
    private javax.swing.JTextField txt_pro_dongia;
    private javax.swing.JTextField txt_pro_ma;
    private javax.swing.JTextField txt_pro_search;
    private javax.swing.JTextField txt_pro_ten;
    // End of variables declaration//GEN-END:variables
}
