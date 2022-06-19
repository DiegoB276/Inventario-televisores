package Interfaz;

import Mundo.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtCode;
	private JTextField txtPrice;
	private JTextField txtCode01;
	private ControlTv CTV;
	private JTextField txtCode001;
	private ButtonGroup btnGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\diego\\Downloads\\logo1.png"));
		this.CTV = new ControlTv();
		setTitle("Inventario TVSmart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		btnGroup = new ButtonGroup();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 642, 395);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Crear", null, panel, null);
		tabbedPane.setBackgroundAt(0, new Color(176, 196, 222));
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Agregar a Inventario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(180, 20, 268, 37);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Codigo TV");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(48, 126, 86, 19);
		panel.add(lblNewLabel_1);

		txtCode = new JTextField();
		txtCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char letter = e.getKeyChar();
				if (letter < '0' || letter > '9')
					e.consume();
			}
		});
		txtCode.setBounds(136, 128, 96, 19);
		panel.add(txtCode);
		txtCode.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Marca del TV");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(48, 176, 98, 19);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Precio del TV");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(48, 240, 108, 19);
		panel.add(lblNewLabel_1_1_1);

		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char letter = e.getKeyChar();
				if (letter < '0' || letter > '9')
					e.consume();
			}
		});
		txtPrice.setColumns(10);
		txtPrice.setBounds(163, 242, 96, 19);
		panel.add(txtPrice);

		

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(new Color(135, 206, 235));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarText();
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpiar.setBounds(329, 298, 132, 30);
		panel.add(btnLimpiar);
		
		JRadioButton rdbtnSamsung = new JRadioButton("Samsung");
		rdbtnSamsung.setSelected(true);
		rdbtnSamsung.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnSamsung.setBounds(183, 176, 96, 21);
		panel.add(rdbtnSamsung);
		
		JRadioButton rdbtnLG = new JRadioButton("LG");
		rdbtnLG.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnLG.setBounds(281, 176, 50, 21);
		panel.add(rdbtnLG);
		
		JRadioButton rdbtnSony = new JRadioButton("Sony");
		rdbtnSony.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnSony.setBounds(346, 176, 63, 21);
		panel.add(rdbtnSony);
		
		JRadioButton rdbtnXiaomi = new JRadioButton("Xiaomi");
		rdbtnXiaomi.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnXiaomi.setBounds(419, 176, 79, 21);
		panel.add(rdbtnXiaomi);
		
		JRadioButton rdbtnHuawei = new JRadioButton("Huawei");
		rdbtnHuawei.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnHuawei.setBounds(234, 199, 86, 21);
		panel.add(rdbtnHuawei);
		
		JRadioButton rdbtnPanasonic = new JRadioButton("Panasonic");
		rdbtnPanasonic.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnPanasonic.setBounds(329, 199, 108, 21);
		panel.add(rdbtnPanasonic);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Eliminar", null, panel_1, null);
		tabbedPane.setBackgroundAt(1, new Color(176, 196, 222));
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Eliminar Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(194, 21, 231, 31);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Codigo del Producto");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(235, 126, 155, 19);
		panel_1.add(lblNewLabel_3);

		txtCode01 = new JTextField();
		txtCode01.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCode01.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char letter = e.getKeyChar();
				if (letter < '0' || letter > '9')
					e.consume();
			}
		});
		txtCode01.setBounds(264, 155, 96, 19);
		panel_1.add(txtCode01);
		txtCode01.setColumns(10);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(240, 128, 128));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int code = Integer.parseInt(txtCode01.getText());
					String ans;
					ans = CTV.EliminarProducto(code);
					JOptionPane.showMessageDialog(null, ans);
					txtCode01.setText("");
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Error, dato no valido");
					txtCode01.setText("");
				}

			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEliminar.setBounds(150, 266, 129, 33);
		panel_1.add(btnEliminar);

		JButton btnLimpiar01 = new JButton("Limpiar");
		btnLimpiar01.setBackground(new Color(135, 206, 235));
		btnLimpiar01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCode01.setText("");
			}
		});
		btnLimpiar01.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpiar01.setBounds(331, 267, 129, 31);
		panel_1.add(btnLimpiar01);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Informacion", null, panel_2, null);
		tabbedPane.setBackgroundAt(2, new Color(176, 196, 222));
		panel_2.setLayout(null);

		JLabel lblInformacionDelProducto = new JLabel("Informacion del Producto");
		lblInformacionDelProducto.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblInformacionDelProducto.setBounds(155, 36, 324, 31);
		panel_2.add(lblInformacionDelProducto);

		JLabel lblNewLabel_4 = new JLabel("Codigo de Producto");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(244, 125, 150, 19);
		panel_2.add(lblNewLabel_4);

		txtCode001 = new JTextField();
		txtCode001.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCode001.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char letter = e.getKeyChar();
				if (letter < '0' || letter > '9')
					e.consume();
			}
		});
		txtCode001.setBounds(266, 154, 96, 19);
		panel_2.add(txtCode001);
		txtCode001.setColumns(10);

		JButton btnConsultarInfo = new JButton("Consultar");
		btnConsultarInfo.setBackground(new Color(240, 128, 128));
		btnConsultarInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ValidarCasillaVacia();
					int codeInput = Integer.parseInt(txtCode001.getText());
					String ans = CTV.consultarInfo(codeInput);
					JOptionPane.showMessageDialog(null, ans);
					txtCode001.setText("");
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Error, dato no valido");
					txtCode001.setText("");
				}

			}
		});
		btnConsultarInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultarInfo.setBounds(175, 249, 119, 31);
		panel_2.add(btnConsultarInfo);

		JButton bntLimpiar001 = new JButton("Limpiar");
		bntLimpiar001.setBackground(new Color(135, 206, 235));
		bntLimpiar001.setFont(new Font("Tahoma", Font.BOLD, 15));
		bntLimpiar001.setBounds(339, 249, 119, 31);
		panel_2.add(bntLimpiar001);
		
		btnGroup.add(rdbtnSamsung);
		btnGroup.add(rdbtnLG);
		btnGroup.add(rdbtnSony);
		btnGroup.add(rdbtnXiaomi);
		btnGroup.add(rdbtnHuawei);
		btnGroup.add(rdbtnPanasonic);
		
		JButton btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.setBackground(new Color(240, 128, 128));
		btnAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ValidarVariasCasillasVacias();
					int numInt = 2147483647;
					double numDouble = 2147483647;
					int code;
					String ans;
					double precio;
					code = Integer.parseInt(txtCode.getText());
					precio = Double.parseDouble(txtPrice.getText());

					if((Integer.parseInt(txtCode.getText()) > numInt || Double.parseDouble(txtPrice.getText()) > numDouble)) {
						JOptionPane.showMessageDialog(null, "Error, datos no validos");
						LimpiarText();
					}else {
						if(rdbtnSamsung.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnSamsung.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
						if(rdbtnLG.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnLG.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
						if(rdbtnSony.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnSony.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
						if(rdbtnXiaomi.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnXiaomi.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
						if(rdbtnHuawei.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnHuawei.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
						if(rdbtnPanasonic.isSelected()) {
							ans = CTV.AgregarProducto(code, rdbtnPanasonic.getText(), precio);
							JOptionPane.showMessageDialog(null, ans);
							LimpiarText();
						}
					}
					
				}
				catch(Exception exception){
					JOptionPane.showMessageDialog(null, "Error, datos no validos");
					txtCode.setText("");
					txtPrice.setText("");
				}
				
			}
		});
		btnAgregarProducto.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAgregarProducto.setBounds(112, 298, 178, 30);
		panel.add(btnAgregarProducto);
	}
	

	public void LimpiarText() {
		txtCode.setText("");
		txtPrice.setText("");
	}

	public void ValidarCasillaVacia() throws Exception {
		if (txtCode001.getText().isEmpty()) {
			throw new Exception("Este campo es obligatorio");
		}
	}
	
	public void ValidarVariasCasillasVacias() throws Exception {
		
		if (txtCode.getText().isEmpty() && txtPrice.getText().isEmpty()) {
			throw new Exception("Campos invalidos");
		}
	}
}
