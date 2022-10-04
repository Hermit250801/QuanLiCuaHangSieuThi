package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import entity.DocGia;
//import iRemote.DocGiaDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class SuaDocGiaDialog2 extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField texTen;
	private JTextField textDiaChi;
	private JTextField textSDT;
	private JTextField textField;
	private JButton btnHuy;
	private AbstractButton btnLamMoi;
	private AbstractButton btnCapNhat;
	//private DocGiaDao docGiaDao;
	private DocGia docGia;
	private JComboBox cbGioiTinh;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ThemDocGiaDialog dialog = new ThemDocGiaDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
	/**
	 * Create the dialog.
	 */
	public SuaDocGiaDialog2(String ma) {
		setIconImage(new ImageIcon("src/main/resources/img/logo.jpg").getImage());
//		try {
//			docGiaDao = (DocGiaDao) Naming.lookup("rmi://192.168.1.3:2910/docGiaDao");
//		} catch (MalformedURLException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		} catch (RemoteException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		} catch (NotBoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		try {
//			docGia=docGiaDao.layDocGiaTheoMa(ma);
//		} catch (RemoteException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		setBounds(100, 100, 849, 463);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblThmcGi = new JLabel("Sá»­a thÃ´ng tin Ä�á»™c Giáº£ ");
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
			lblNewLabel_2.setBounds(25, 283, 115, 35);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Há»� tÃªn:");
			lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_2.setBounds(25, 157, 115, 35);
			contentPanel.add(lblNewLabel_2);
		}
		{
			texTen = new JTextField();
			texTen.setFont(new Font("Tahoma", Font.PLAIN, 16));
			texTen.setColumns(10);
			texTen.setBounds(149, 159, 650, 35);
			contentPanel.add(texTen);
		}
		{
			textDiaChi = new JTextField();
			textDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textDiaChi.setColumns(10);
			textDiaChi.setBounds(149, 285, 650, 35);
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
			 btnCapNhat = new JButton("Cáº­p nháº­t");
			btnCapNhat.setIconTextGap(15);
			btnCapNhat.setForeground(new Color(0, 0, 0));
			btnCapNhat.setFont(new Font("Arial", Font.BOLD, 16));
			btnCapNhat.setBackground(new Color(0, 102, 255));
			btnCapNhat.setBounds(678, 366, 131, 40);
			contentPanel.add(btnCapNhat);
		}
		{
			textSDT = new JTextField();
			textSDT.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textSDT.setColumns(10);
			textSDT.setBounds(149, 220, 248, 35);
			contentPanel.add(textSDT);
		}
		{
			 cbGioiTinh = new JComboBox();
			cbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Giá»›i tÃ­nh", "Nam", "Ná»¯"}));
			cbGioiTinh.setFont(new Font("Arial", Font.PLAIN, 16));
			cbGioiTinh.setBounds(547, 220, 255, 35);
			contentPanel.add(cbGioiTinh);
		}
		{
			JLabel lblGioiTinh = new JLabel("Giá»›i tÃ­nh:");
			lblGioiTinh.setFont(new Font("Arial", Font.BOLD, 16));
			lblGioiTinh.setBounds(456, 220, 81, 35);
			contentPanel.add(lblGioiTinh);
		}
		{
			JLabel lblSDT = new JLabel("SDT:");
			lblSDT.setFont(new Font("Arial", Font.BOLD, 16));
			lblSDT.setBounds(22, 223, 76, 35);
			contentPanel.add(lblSDT);
		}
		{
			JLabel lblMNhnVin = new JLabel("MÃ£ nhÃ¢n viÃªn:");
			lblMNhnVin.setFont(new Font("Arial", Font.BOLD, 16));
			lblMNhnVin.setBounds(25, 96, 143, 35);
			contentPanel.add(lblMNhnVin);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField.setColumns(10);
			textField.setBounds(149, 93, 650, 35);
			contentPanel.add(textField);
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		//loadDuLieu(docGia);
		btnHuy.addActionListener(this);
		btnCapNhat.addActionListener(this);
		btnLamMoi.addActionListener(this);
	}
//public void loadDuLieu(DocGia docGia) {
//	textField.setText(docGia.getMaDocGia().toString());
//	texTen.setText(docGia.getTenDocGia().toString());
//	textDiaChi.setText(docGia.getDiaChi().toString());
//	textSDT.setText(docGia.getSoDienThoai().toString());
//	cbGioiTinh.setSelectedItem(docGia.isGioiTinh() ? "Nam" : "Ná»¯");
//}
public boolean capNhatDocGia() {
	String tenDG= texTen.getText().toString().trim();
	String diaChi= textDiaChi.getText().toString().trim();
	String sdt= textSDT.getText().toString().trim();
	if (tenDG.trim().equals("")) {
		JOptionPane.showMessageDialog(this, "TÃªn khÃ´ng Ä‘Æ°á»£c trá»‘ng");
		texTen.selectAll();
		texTen.requestFocus();
		return false;
	}
	if (!tenDG.matches("" + "[aAÃ Ã€áº£áº¢Ã£ÃƒÃ¡Ã�áº¡áº ÄƒÄ‚áº±áº°áº³áº²áºµáº´áº¯áº®áº·áº¶Ã¢Ã‚áº§áº¦áº©áº¨áº«áºªáº¥áº¤áº­áº¬bBcCdDÄ‘Ä�eEÃ¨Ãˆáº»áººáº½áº¼Ã©Ã‰áº¹áº¸ÃªÃŠá»�á»€á»ƒá»‚á»…á»„áº¿áº¾á»‡á»†"
			+ "fFgGhHiIÃ¬ÃŒá»‰á»ˆÄ©Ä¨Ã­Ã�á»‹á»ŠjJkKlLmMnNoOÃ²Ã’á»�á»ŽÃµÃ•Ã³Ã“á»�á»ŒÃ´Ã”á»“á»’á»•á»”á»—á»–á»‘á»�á»™á»˜Æ¡Æ á»�á»œá»Ÿá»žá»¡á» á»›á»šá»£á»¢pPqQrRsStTu"
			+ "UÃ¹Ã™á»§á»¦Å©Å¨ÃºÃšá»¥á»¤Æ°Æ¯á»«á»ªá»­á»¬á»¯á»®á»©á»¨á»±á»°vVwWxXyYá»³á»²á»·á»¶á»¹á»¸Ã½Ã�á»µá»´zZ ]+")) {
		JOptionPane.showMessageDialog(this, "TÃªn khÃ´ng cÃ³ kÃ­ tá»± Ä‘áº·c biá»‡t");
		texTen.selectAll();
		texTen.requestFocus();
		return false;
	}
	if (sdt.trim().length() == 0) {
		JOptionPane.showMessageDialog(null, "Vui lÃ²ng nháº­p sá»‘ Ä‘iá»‡n thoáº¡i");
		textSDT.selectAll();
		textSDT.requestFocus();
		return false;
	}
	if (!sdt.matches("^0[1-9][0-9]{8}")) {
		JOptionPane.showMessageDialog(this, "Sá»‘ Ä‘iá»‡n thoáº¡i lÃ  dÃ£y s!");
		textSDT.selectAll();
		textSDT.requestFocus();

		return false;
	}
	if (cbGioiTinh.getSelectedIndex() == 0) {
		JOptionPane.showMessageDialog(this, "Vui lÃ²ng chá»�n tá»‰nh giá»›i tÃ­nh");
		return false;
	}
	if (diaChi.trim().equals("")) {
		JOptionPane.showMessageDialog(this, "Ä�á»‹a chá»‰ khÃ´ng Ä‘Æ°á»£c trá»‘ng");
		textDiaChi.selectAll();
		textDiaChi.requestFocus();
		return false;
	}
	if (!diaChi.matches("" + "[aAÃ Ã€áº£áº¢Ã£ÃƒÃ¡Ã�áº¡áº ÄƒÄ‚áº±áº°áº³áº²áºµáº´áº¯áº®áº·áº¶Ã¢Ã‚áº§áº¦áº©áº¨áº«áºªáº¥áº¤áº­áº¬bBcCdDÄ‘Ä�eEÃ¨Ãˆáº»áººáº½áº¼Ã©Ã‰áº¹áº¸ÃªÃŠá»�á»€á»ƒá»‚á»…á»„áº¿áº¾á»‡á»†"
			+ "fFgGhHiIÃ¬ÃŒá»‰á»ˆÄ©Ä¨Ã­Ã�á»‹á»ŠjJkKlLmMnNoOÃ²Ã’á»�á»ŽÃµÃ•Ã³Ã“á»�á»ŒÃ´Ã”á»“á»’á»•á»”á»—á»–á»‘á»�á»™á»˜Æ¡Æ á»�á»œá»Ÿá»žá»¡á» á»›á»šá»£á»¢pPqQrRsStTu"
			+ "UÃ¹Ã™á»§á»¦Å©Å¨ÃºÃšá»¥á»¤Æ°Æ¯á»«á»ªá»­á»¬á»¯á»®á»©á»¨á»±á»°vVwWxXyYá»³á»²á»·á»¶á»¹á»¸Ã½Ã�á»µá»´zZ ]+")) {
		JOptionPane.showMessageDialog(this, "Ä�á»‹a chá»‰ khÃ´ng cÃ³ kÃ­ tá»± Ä‘áº·c biá»‡t");
		textDiaChi.selectAll();
		textDiaChi.requestFocus();
		return false;
	}
//	System.out.println(docGiaDao.phatSinhMaTuDong());
	DocGia dG= new DocGia();
	
//	try {
//		DocGia docGia=docGiaDao.layDocGiaTheoMa(textField.getText().toString());
//		System.out.println(docGia);
//	} catch (RemoteException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	dG.setMaDocGia(docGia.getMaDocGia().toString());
//	dG.setTenDocGia(tenDG);
//	dG.setDiaChi(diaChi);
//	dG.setGioiTinh(isgioiTinh());
//	dG.setSoDienThoai(sdt);
System.out.println("Uprat");
System.out.println(dG);

//	try {
//		docGiaDao.capNhatDocGia(dG);
//	} catch (RemoteException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
	return true;
}
public boolean isgioiTinh() {

	if (cbGioiTinh.getSelectedIndex() == 1) {
		return true;
	}
	if (cbGioiTinh.getSelectedIndex() == 2) {
		return false;
	}
	return true;
}
	public void actionPerformed(ActionEvent e) {
		Object object= e.getSource();
		if(object.equals(btnHuy)) {
			dispose();
		}
		else if(object.equals(btnCapNhat)) {
			if (capNhatDocGia()) {
				JOptionPane.showMessageDialog(this, "ThÃ´ng tin Ä‘á»™c giáº£ cáº­p nháº­t thÃ nh cÃ´ng!");
				dispose();
			}
		}
		else if(object.equals(btnLamMoi)) {
			//loadDuLieu(docGia);
		}
	}

}
