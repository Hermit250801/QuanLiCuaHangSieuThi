package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TrangChuAdmin extends JFrame implements ActionListener, MouseListener{
	private JPanel panel_TrangChu;
	private JPanel panel_home;
	private JPanel panel_banhang;
	private JPanel panel_BanHang;

	public TrangChuAdmin() {
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 160));
		panel_1.setBounds(0, 0, 136, 663);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\User_Icon.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 136, 99);
		panel_1.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(0, 255, 0));
		lblUserName.setBackground(new Color(0, 255, 0));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUserName.setBounds(0, 87, 136, 29);
		panel_1.add(lblUserName);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblRole.setForeground(new Color(0, 255, 255));
		lblRole.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblRole.setBackground(Color.GREEN);
		lblRole.setBounds(0, 109, 136, 29);
		panel_1.add(lblRole);
		
		panel_TrangChu = new JPanel();
		panel_TrangChu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onClick(panel_TrangChu);
				panel_home.setVisible(true);
				panel_banhang.setVisible(false);
				onLeaveClick(panel_BanHang);
			}
		});
		
		panel_TrangChu.setBackground(new Color(0, 0, 64));
		panel_TrangChu.setBounds(0, 136, 136, 52);
		panel_1.add(panel_TrangChu);
		panel_TrangChu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-2, 0, 136, 38);
		panel_TrangChu.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\icons8-home-24.png"));
		
		JLabel lblNewLabel_2 = new JLabel("Trang Ch\u1EE7");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(-2, 24, 136, 24);
		panel_TrangChu.add(lblNewLabel_2);
		
		panel_BanHang = new JPanel();
		panel_BanHang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onClick(panel_BanHang);
				onLeaveClick(panel_TrangChu);
				panel_home.setVisible(false);
				panel_banhang.setVisible(true);
			}
		});
		
		panel_BanHang.setLayout(null);
		panel_BanHang.setBackground(new Color(0, 0, 64));
		panel_BanHang.setBounds(0, 186, 136, 52);
		panel_1.add(panel_BanHang);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\icons8-shopping-cart-24.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(-2, 0, 136, 38);
		panel_BanHang.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("B\u00E1n H\u00E0ng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(-2, 24, 136, 24);
		panel_BanHang.add(lblNewLabel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 0, 64));
		panel_2_1_1.setBounds(0, 237, 136, 52);
		panel_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\icons8-product-32.png"));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(-2, 0, 136, 32);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("S\u1EA3n Ph\u1EA9m");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(-2, 24, 136, 28);
		panel_2_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBackground(new Color(0, 0, 64));
		panel_2_1_2.setBounds(0, 277, 136, 65);
		panel_1.add(panel_2_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\Employee_Icon.png"));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2.setBounds(-2, 10, 136, 38);
		panel_2_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nh\u00E2n Vi\u00EAn");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(-2, 41, 136, 24);
		panel_2_1_2.add(lblNewLabel_2_1_2);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBackground(new Color(0, 0, 64));
		panel_2_1_2_1.setBounds(0, 341, 136, 52);
		panel_1.add(panel_2_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\icons8-customer-insight-24.png"));
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(-2, 0, 136, 38);
		panel_2_1_2_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Kh\u00E1ch H\u00E0ng");
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1_2_1.setBounds(-2, 24, 136, 24);
		panel_2_1_2_1.add(lblNewLabel_2_1_2_1);
		
		JPanel panel_2_1_2_2 = new JPanel();
		panel_2_1_2_2.setLayout(null);
		panel_2_1_2_2.setBackground(new Color(0, 0, 64));
		panel_2_1_2_2.setBounds(0, 390, 136, 52);
		panel_1.add(panel_2_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_2_2.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\Salary_Icon.png"));
		lblNewLabel_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_2.setBounds(-2, 0, 136, 38);
		panel_2_1_2_2.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Th\u1ED1ng K\u00EA");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1_2_2.setBounds(-2, 24, 136, 24);
		panel_2_1_2_2.add(lblNewLabel_2_1_2_2);
		
		JPanel panel_2_1_2_2_1 = new JPanel();
		panel_2_1_2_2_1.setLayout(null);
		panel_2_1_2_2_1.setBackground(new Color(0, 0, 64));
		panel_2_1_2_2_1.setBounds(0, 611, 136, 52);
		panel_1.add(panel_2_1_2_2_1);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1.setIcon(new ImageIcon("D:\\Nam4.1\\LTPT\\TestCode\\QuanLiBanHangSieuThi_Client\\icons\\icons8-logout-24.png"));
		lblNewLabel_1_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_2_1.setBounds(-2, 0, 136, 38);
		panel_2_1_2_2_1.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("\u0110\u0103ng Xu\u1EA5t");
		lblNewLabel_2_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1.setBounds(-2, 24, 136, 24);
		panel_2_1_2_2_1.add(lblNewLabel_2_1_2_2_1);
		
		JPanel panel_content = new JPanel();
		panel_content.setBounds(134, 0, 1059, 673);
		panel.add(panel_content);
		panel_content.setLayout(null);
		
		panel_home = new JPanel();
		panel_home.setBounds(0, 0, 1049, 663);
		panel_content.add(panel_home);
		panel_home.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("HOME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(292, 198, 132, 64);
		panel_home.add(lblNewLabel_3);
		
		panel_banhang = new JPanel();
		panel_banhang.setLayout(null);
		panel_banhang.setBounds(0, 0, 1049, 663);
		panel_content.add(panel_banhang);
		
		JLabel lblNewLabel_3_1 = new JLabel("B\u00E1n h\u00E0ng");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3_1.setBounds(292, 198, 132, 64);
		
		
		
		panel_banhang.add(lblNewLabel_3_1);
		
	
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object object = e.getSource();
		if(object.equals(panel_TrangChu)) {
			panel_home.setVisible(true);
			panel_banhang.setVisible(false);
			System.out.println("trang chủ");
		} else if(object.equals(panel_BanHang)) {
			panel_home.setVisible(false);
			panel_banhang.setVisible(true);
		}
		
	}
	
	private void onClick(JPanel panel) {
		panel.setBackground(new Color(0,153,204));
	}
	
	private void onLeaveClick(JPanel panel) {
		panel.setBackground(new Color(0,0,51));
	}
}
