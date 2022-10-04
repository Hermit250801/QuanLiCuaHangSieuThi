package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import com.toedter.calendar.JDateChooser;

//import entity.DocGia;
//import entity.NhanVien;
//import entity.TaiKhoan;
//import iRemote.ITaiKhoan;
//import iRemote.NhanVienDao;

public class ThemNhanVien extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField texTen;
	private JTextField textDiaChi;
	private JTextField textSDT;
	private AbstractButton btnLamMoi;
	private JButton btnHuy;
	private JButton btnLuu;
	//private NhanVienDao nhanVienDao;
	private JDateChooser ngaySinh;
	private JComboBox cbGioiTinh;
	private NhanVien nhanVien;
	private JComboBox cbChucVu;
	//private ITaiKhoan taiKhoanDao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ThemNhanVien dialog = new ThemNhanVien();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ThemNhanVien() {
		setIconImage(new ImageIcon("src/main/resources/img/logo.jpg").getImage());
		setModal(true);
//		try {
//			nhanVienDao = (NhanVienDao) Naming.lookup("rmi://192.168.1.3:2910/nhanVienDao");
//			taiKhoanDao=(ITaiKhoan) Naming.lookup("rmi://192.168.1.3:2910/iTaiKhoan");
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (RemoteException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (NotBoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 849, 463);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblThmcGi = new JLabel("ThÃªm NhÃ¢n ViÃªn");
			lblThmcGi.setOpaque(true);
			lblThmcGi.setHorizontalAlignment(SwingConstants.CENTER);
			lblThmcGi.setForeground(new Color(204, 102, 51));
			lblThmcGi.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblThmcGi.setBackground(new Color(245, 245, 220));
			lblThmcGi.setBounds(0, 0, 835, 50);
			contentPanel.add(lblThmcGi);
		}
		{
			 btnHuy = new JButton("Há»§y");
			btnHuy.setIconTextGap(20);
			btnHuy.setForeground(new Color(0, 0, 0));
			btnHuy.setFont(new Font("Arial", Font.BOLD, 16));
			btnHuy.setBackground(new Color(255, 69, 0));
			btnHuy.setBounds(25, 365, 131, 40);
			contentPanel.add(btnHuy);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Ä�á»‹a chá»‰:");
			lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_2.setBounds(25, 272, 58, 35);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Há»� tÃªn:");
			lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_2.setBounds(28, 128, 115, 35);
			contentPanel.add(lblNewLabel_2);
		}
		{
			texTen = new JTextField();
			texTen.setFont(new Font("Tahoma", Font.PLAIN, 16));
			texTen.setColumns(10);
			texTen.setBounds(101, 130, 275, 35);
			contentPanel.add(texTen);
		}
		{
			textDiaChi = new JTextField();
			textDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textDiaChi.setColumns(10);
			textDiaChi.setBounds(101, 274, 275, 35);
			contentPanel.add(textDiaChi);
		}
		{
			 btnLamMoi = new JButton("LÃ m má»›i");
			btnLamMoi.setMargin(new Insets(2, 0, 2, 0));
			btnLamMoi.setIconTextGap(2);
			btnLamMoi.setForeground(new Color(0, 0, 0));
			btnLamMoi.setFont(new Font("Arial", Font.BOLD, 16));
			btnLamMoi.setBackground(new Color(102, 153, 51));
			btnLamMoi.setBounds(535, 366, 131, 40);
			contentPanel.add(btnLamMoi);
		}
		{
			 btnLuu = new JButton("ThÃªm");
//			 btnLuu.addActionListener(new ActionListener() {
//			 	public void actionPerformed(ActionEvent e) {
//			 		boolean nv= themNhanVien();
//			 		
//			 		if(nv) {
//	
//			 			JOptionPane.showMessageDialog(null,"ThÃªm nhÃ¢n viÃªn thÃ nh cÃ´ng");
//			 		
//			 		}
//			 	}
//			 });
			btnLuu.setIconTextGap(15);
			btnLuu.setForeground(new Color(0, 0, 0));
			btnLuu.setFont(new Font("Arial", Font.BOLD, 16));
			btnLuu.setBackground(new Color(0, 102, 255));
			btnLuu.setBounds(678, 366, 131, 40);
			contentPanel.add(btnLuu);
		}
		{
			textSDT = new JTextField();
			textSDT.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textSDT.setColumns(10);
			textSDT.setBounds(101, 200, 275, 35);
			contentPanel.add(textSDT);
		}
		{
			 cbGioiTinh = new JComboBox();
			cbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Giá»›i tÃ­nh", "Nam", "Ná»¯"}));
			cbGioiTinh.setFont(new Font("Arial", Font.PLAIN, 16));
			cbGioiTinh.setBounds(522, 200, 283, 35);
			contentPanel.add(cbGioiTinh);
		}
		{
			JLabel lblGioiTinh = new JLabel("Giá»›i tÃ­nh:");
			lblGioiTinh.setFont(new Font("Arial", Font.BOLD, 16));
			lblGioiTinh.setBounds(419, 198, 106, 35);
			contentPanel.add(lblGioiTinh);
		}
		{
			JLabel lblSDT = new JLabel("SDT:");
			lblSDT.setFont(new Font("Arial", Font.BOLD, 16));
			lblSDT.setBounds(25, 203, 76, 35);
			contentPanel.add(lblSDT);
		}
		
		JLabel lblNgySinh = new JLabel("NgÃ y sinh:");
		lblNgySinh.setFont(new Font("Arial", Font.BOLD, 16));
		lblNgySinh.setBounds(419, 128, 106, 35);
		contentPanel.add(lblNgySinh);
		
		JLabel lblNewLabel_2 = new JLabel("Chá»©c vá»¥:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(419, 270, 82, 35);
		contentPanel.add(lblNewLabel_2);
		
		 ngaySinh = new JDateChooser();
		ngaySinh.setBounds(522, 128, 283, 35);
		contentPanel.add(ngaySinh);
		
		 cbChucVu = new JComboBox();
		cbChucVu.setModel(new DefaultComboBoxModel(new String[] {"Chá»©c vá»¥", "Quáº£n lÃ½", "NhÃ¢n viÃªn"}));
		cbChucVu.setFont(new Font("Arial", Font.PLAIN, 16));
		cbChucVu.setBounds(526, 272, 283, 35);
		contentPanel.add(cbChucVu);
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		btnHuy.addActionListener(this);
		btnLuu.addActionListener(this);
		btnLamMoi.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object object= e.getSource();
		if(object.equals(btnHuy)) {
			dispose();
		}
		else if(object.equals(btnLamMoi)) {
			texTen.setText("");
			textSDT.setText("");
			textDiaChi.setText("");
			cbGioiTinh.setSelectedIndex(0);
			cbChucVu.setSelectedIndex(0);
			ngaySinh.setDate(null);
		}
	}
//	public boolean themNhanVien() {
//		String tennv= texTen.getText().toString().trim();
//		Date ngay=ngaySinh.getDate();
//		String diaChi= textDiaChi.getText().toString().trim();
//		String sdt= textSDT.getText().toString().trim();
//	
//		if (tennv.trim().equals("")) {
//			JOptionPane.showMessageDialog(this, "TÃªn khÃ´ng Ä‘Æ°á»£c trá»‘ng");
//			texTen.selectAll();
//			texTen.requestFocus();
//			return false;
//		}
//		if (!tennv.matches("" + "[aAÃ Ã€áº£áº¢Ã£ÃƒÃ¡Ã�áº¡áº ÄƒÄ‚áº±áº°áº³áº²áºµáº´áº¯áº®áº·áº¶Ã¢Ã‚áº§áº¦áº©áº¨áº«áºªáº¥áº¤áº­áº¬bBcCdDÄ‘Ä�eEÃ¨Ãˆáº»áººáº½áº¼Ã©Ã‰áº¹áº¸ÃªÃŠá»�á»€á»ƒá»‚á»…á»„áº¿áº¾á»‡á»†"
//				+ "fFgGhHiIÃ¬ÃŒá»‰á»ˆÄ©Ä¨Ã­Ã�á»‹á»ŠjJkKlLmMnNoOÃ²Ã’á»�á»ŽÃµÃ•Ã³Ã“á»�á»ŒÃ´Ã”á»“á»’á»•á»”á»—á»–á»‘á»�á»™á»˜Æ¡Æ á»�á»œá»Ÿá»žá»¡á» á»›á»šá»£á»¢pPqQrRsStTu"
//				+ "UÃ¹Ã™á»§á»¦Å©Å¨ÃºÃšá»¥á»¤Æ°Æ¯á»«á»ªá»­á»¬á»¯á»®á»©á»¨á»±á»°vVwWxXyYá»³á»²á»·á»¶á»¹á»¸Ã½Ã�á»µá»´zZ ]+")) {
//			JOptionPane.showMessageDialog(this, "TÃªn khÃ´ng cÃ³ kÃ­ tá»± Ä‘áº·c biá»‡t");
//			texTen.selectAll();
//			texTen.requestFocus();
//			return false;
//		}
//		if (sdt.trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "Vui lÃ²ng nháº­p sá»‘ Ä‘iá»‡n thoáº¡i");
//			textSDT.selectAll();
//			textSDT.requestFocus();
//			return false;
//		}
//		if (!sdt.matches("^0[1-9][0-9]{8}")) {
//			JOptionPane.showMessageDialog(this, "Sá»‘ Ä‘iá»‡n thoáº¡i lÃ  dÃ£y s!");
//			textSDT.selectAll();
//			textSDT.requestFocus();
//
//			return false;
//		}
//		if (cbGioiTinh.getSelectedIndex() == 0) {
//			JOptionPane.showMessageDialog(this, "Vui lÃ²ng chá»�n  giá»›i tÃ­nh");
//			return false;
//		}
//		if (diaChi.trim().equals("")) {
//			JOptionPane.showMessageDialog(this, "Ä�á»‹a chá»‰ khÃ´ng Ä‘Æ°á»£c trá»‘ng");
//			textDiaChi.selectAll();
//			textDiaChi.requestFocus();
//			return false;
//		}
//		if (ngaySinh.getDate() == null) {
//			JOptionPane.showMessageDialog(this, "Vui lÃ²ng chá»�n ngÃ y sinh");
//			return false;
//		}
//		if (cbChucVu.getSelectedIndex() == 0) {
//			JOptionPane.showMessageDialog(this, "Vui lÃ²ng chá»�n chá»©c vá»¥");
//			return false;
//		}
////		nhanVien =new NhanVien();
////		nhanVien.setTenNhanVien(tennv);
////		nhanVien.setNgaySinh(ngay);
////		nhanVien.setSoDienThoai(sdt);
////		nhanVien.setDiaChi(diaChi);
////		nhanVien.setChucVu(isChucVu());
////		nhanVien.setGioiTinh(isgioiTinh());
//		
////		System.out.println(nhanVien);
////		TaiKhoan taiKhoan= new TaiKhoan();
////		taiKhoan.setMatKhau(nhanVien.getMaNhanVien());
////		taiKhoan.setTenTaiKhoan(nhanVien.getMaNhanVien());
////		taiKhoan.setNhanVien(nhanVien);
////		taiKhoan.setTenTaiKhoan(nhanVien.getMaNhanVien());
////		taiKhoan.setMatKhau("111111");
////		nhanVien.setTaiKhoan(taiKhoan);
////		try {
////			boolean b = taiKhoanDao.themTaiKhoan(taiKhoan);
////			return b;
////		} catch (RemoteException e) {
////			
////			e.printStackTrace();
////			return false;
////		}
//	}
//	public boolean isgioiTinh() {
//
//		if (cbGioiTinh.getSelectedIndex() == 1) {
//			return true;
//		}
//		if (cbGioiTinh.getSelectedIndex() == 2) {
//			return false;
//		}
//		return true;
//	}
//	public boolean isChucVu() {

//		if (cbChucVu.getSelectedIndex() == 1) {
//			return true;
//		}
//		if (cbChucVu.getSelectedIndex() == 2) {
//			
//		
//		return false;
//	}
//		return false;
//		}
}