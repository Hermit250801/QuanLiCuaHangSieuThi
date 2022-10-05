package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.FlowLayout;

//import entity.TaiKhoan;

public class TrangChu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3267576735935490358L;
	private JPanel contentPane;
	private JButton btnSach;
	private JButton btnBanHang;
	private JButton btnNhanVien;
	private JPopupMenu popupDocGia;
	private JButton btnKhachHang;
	private JLabel lblThoat;
	private JPanel pnThayDoi;
	
	private JPanel guiDocGia= new QLDocGia();
	private GuiSanPham guiSach= new GuiSanPham();
	private JPanel guiMuonTraSach= new BanHang();
	private JPanel guiNhanVien= new DSNhanVien();
	private JLabel lblNguoiDung;
	private JLabel lblChucVu;
	//private TaiKhoan taiKhoan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrangChu() {
		setPreferredSize(new Dimension(1650, 800));
		getContentPane().setPreferredSize(new Dimension(1650, 800));
		getContentPane().setMaximumSize(new Dimension(1650, 800));
		setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setIconImage(new ImageIcon("src/main/resources/img/logo.jpg").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setSize(screenSize.width, screenSize.height);

		contentPane = (JPanel) getContentPane();
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1522, 69);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(664, 19, 0, 0);
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon("src\\main\\resources\\img\\logo.jpg"));
		panel.add(lblNewLabel);

		lblNguoiDung = new JLabel("Trường");
		lblNguoiDung.setBounds(1227, -1, 156, 29);
		lblNguoiDung.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNguoiDung.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNguoiDung.setIcon(
				new ImageIcon("src\\main\\resources\\img\\profile-user.png"));
		lblNguoiDung.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(lblNguoiDung);

		lblChucVu = new JLabel("Quản Lí");
		lblChucVu.setBounds(1393, 5, 65, 22);
		lblChucVu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChucVu.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel.add(lblChucVu);
		
		lblThoat = new JLabel("Thoát");
		lblThoat.setBounds(1458, 5, 54, 22);
		lblThoat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThoat.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblThoat);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 69, 1522, 56);
		panel_1.setBackground(Color.WHITE);
		panel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_1.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(4,135,217)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		btnSach = new JButton("Sản Phẩm");
		btnSach.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btnSach.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSach.setRequestFocusEnabled(false);
		btnSach.setBorder(new LineBorder(new Color(4,135,217)));
		btnSach.setPreferredSize(new Dimension(150, 56));
		btnSach.setForeground(Color.WHITE);
		btnSach.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSach.setBackground(new Color(4,135,217));
		btnSach.setBounds(0, -1, 150, 54);
		panel_1.add(btnSach);

		btnBanHang = new JButton("Bán hàng");

		btnBanHang.setRequestFocusEnabled(false);
		btnBanHang.setBorder(new LineBorder(new Color(4,135,217)));
		btnBanHang.setPreferredSize(new Dimension(150, 56));
		btnBanHang.setForeground(Color.WHITE);
		btnBanHang.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBanHang.setBackground(new Color(4,135,217));
		btnBanHang.setBounds(150, -1, 150, 54);
		panel_1.add(btnBanHang);

		btnKhachHang = new JButton("Khách Hàng");
		btnKhachHang.setRequestFocusEnabled(false);
		btnKhachHang.setBorder(new LineBorder(new Color(4,135,217)));
		btnKhachHang.setPreferredSize(new Dimension(150, 56));
		btnKhachHang.setForeground(Color.WHITE);
		btnKhachHang.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKhachHang.setBackground(new Color(4,135,217));
		btnKhachHang.setBounds(300, -1, 150, 54);
		panel_1.add(btnKhachHang);

		btnNhanVien = new JButton("Nh\u00E2n vi\u00EAn");

		btnNhanVien.setRequestFocusEnabled(false);
		btnNhanVien.setBorder(new LineBorder(new Color(4,135,217)));
		btnNhanVien.setPreferredSize(new Dimension(150, 56));
		btnNhanVien.setForeground(Color.WHITE);
		btnNhanVien.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNhanVien.setBackground(new Color(4,135,217));
		btnNhanVien.setBounds(450, -1, 150, 54);
		panel_1.add(btnNhanVien);

		
		pnThayDoi=guiSach;
		guiSach.setBounds(0, 122, 1522, 699);
		getContentPane().add(pnThayDoi);
		guiSach.setLayout(new BorderLayout(0, 0));

		popupDocGia = new JPopupMenu();
		addPopup(btnKhachHang, popupDocGia);
		popupDocGia.setBorder(new LineBorder(new Color(0, 0, 0)));
		popupDocGia.setAlignmentX(0.5f);

		JMenuItem pop = new JMenuItem("\u0110\u1ECDc gi\u1EA3");
		pop.setPreferredSize(new Dimension(147, 36));
		pop.setForeground(Color.BLACK);
		pop.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pop.setBackground(Color.GRAY);
		popupDocGia.add(pop);
		btnSach.setBackground(new Color(4,178,217));
		JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("Th\u1EBB \u0111\u1ECDc s\u00E1ch");
		mntmNewMenuItem_1_2.setPreferredSize(new Dimension(145, 36));
		mntmNewMenuItem_1_2.setForeground(Color.BLACK);
		mntmNewMenuItem_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mntmNewMenuItem_1_2.setBackground(Color.GRAY);
		popupDocGia.add(mntmNewMenuItem_1_2);

		lblThoat.addMouseListener(new MouseListener() {

			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int temp=JOptionPane.showConfirmDialog(null, "Báº¡n cÃ³ muá»‘n thoÃ¡t","XÃ¡c nháº­n",JOptionPane.YES_NO_OPTION);
				if(temp==JOptionPane.YES_OPTION) {
					dispose();
					DangNhap.getGuiDangNhap().setVisible(true);
					
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblThoat.setForeground(Color.BLACK);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblThoat.setForeground(Color.GRAY);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		suKienChuotButton(btnBanHang, null);
		suKienChuotButton(btnNhanVien, null);
		suKienChuotButton(btnSach, null);
		suKienChuotButton(btnKhachHang, null);
		
		btnBanHang.addActionListener(e->{
			setPnThayDoi(guiMuonTraSach);
			
		});
		btnSach.addActionListener(e->{
			setPnThayDoi(guiSach);
		});
		btnKhachHang.addActionListener(e->{
			setPnThayDoi(guiDocGia);
			
		});
		btnNhanVien.addActionListener(e->{
			setPnThayDoi(guiNhanVien);
			
		});
		lblNguoiDung.addMouseListener(new MouseListener() {
			

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
//				XemThongTinNhanVien thongTinNhanVien= new XemThongTinNhanVien();
//				thongTinNhanVien.setTaiKhoan(taiKhoan);
//				thongTinNhanVien.setVisible(true);				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNguoiDung.setForeground(Color.BLACK);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNguoiDung.setForeground(Color.GRAY);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void suKienChuotButton(JButton button, JPopupMenu popupMenu) {
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				resetColorMenu();
				button.setBackground(new Color(4,178,217));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Ä‘Æ°a táº¥t cáº£ menu vá»� mÃ u gá»‘c
	 * 
	 */
	public void resetColorMenu() {
		btnBanHang.setBackground(new Color(4,135,217));
		btnNhanVien.setBackground(new Color(4,135,217));
		btnSach.setBackground(new Color(4,135,217));
		btnKhachHang.setBackground(new Color(4,135,217));
	}
	/**
	 * Thay Ä‘á»•i cÃ¡c pannel
	 * @param panel
	 */
	public void setPnThayDoi(JPanel panel) {
		SwingUtilities.invokeLater(()->{
			getContentPane().remove(pnThayDoi);
			pnThayDoi=panel;
			pnThayDoi.setBounds(10, 162, 1550, 700);
			this.revalidate();
			this.repaint();
			getContentPane().add(pnThayDoi);
		});
		
	}
//	public void setTaiKhoan(TaiKhoan taiKhoan) {
////		lblNguoiDung.setText(taiKhoan.getNhanVien().getTenNhanVien());
////		lblChucVu.setText(taiKhoan.getNhanVien().isChucVu()?"Quan lÃ½":"Thá»§ thÆ°");
////		this.taiKhoan=taiKhoan;
////		this.guiSach.setNhanVien(taiKhoan.getNhanVien());
////		System.out.println(this.taiKhoan);
////		if(!taiKhoan.getNhanVien().isChucVu()) {
////			btnNhanVien.setVisible(false);
////		}
//	}
}
