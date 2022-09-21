package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 417);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setVisible(true);
			}
		});
		mntmClientes.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmClientes);
		
		JMenuItem mntmVeterinarios = new JMenuItem("Veterinarios");
		mntmVeterinarios.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmVeterinarios);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnVentas);
		
		JMenu mnProductos = new JMenu("Productos");
		mnVentas.add(mnProductos);
		
		JMenuItem mntmAlimento = new JMenuItem("Alimento");
		mnProductos.add(mntmAlimento);
		
		JMenuItem mntmAccesorios = new JMenuItem("Accesorios");
		mnProductos.add(mntmAccesorios);
		
		JMenuItem mntmMedicos = new JMenuItem("Medicos");
		mnProductos.add(mntmMedicos);
		
		JMenuItem mntmProveedores = new JMenuItem("Proveedores");
		mnVentas.add(mntmProveedores);
		
		JMenuItem mntmStock = new JMenuItem("Stock");
		mnVentas.add(mntmStock);
		
		JMenuItem mntmFacturacion = new JMenuItem("Facturacion");
		mnVentas.add(mntmFacturacion);
		
		JMenuItem mntmPresupuestos = new JMenuItem("Presupuestos");
		mnVentas.add(mntmPresupuestos);
		
		JMenu mnTurnos = new JMenu("Turnos");
		mnTurnos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnTurnos);
		
		JMenuItem mntmCitas = new JMenuItem("Citas");
		mnTurnos.add(mntmCitas);
		
		JMenuItem mntmVisitas = new JMenuItem("Visitas");
		mnTurnos.add(mntmVisitas);
		
		JMenuItem mntmIntervenciones = new JMenuItem("Intervenciones");
		mnTurnos.add(mntmIntervenciones);
		
		JMenu mnArchivos = new JMenu("Archivos");
		mnArchivos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnArchivos);
		
		JMenuItem mntmABMCliente = new JMenuItem("ABM Cliente");
		mnArchivos.add(mntmABMCliente);
		
		JMenuItem mntmABMMascota = new JMenuItem("ABM Mascota");
		mnArchivos.add(mntmABMMascota);
		
		JMenu mnABMProducto = new JMenu("ABM Producto");
		mnArchivos.add(mnABMProducto);
		
		JMenuItem mntmABMAlimenticio = new JMenuItem("Alimenticio");
		mnABMProducto.add(mntmABMAlimenticio);
		
		JMenuItem mntmAccesorio = new JMenuItem("Accesorio");
		mnABMProducto.add(mntmAccesorio);
		
		JMenuItem mntmMedico = new JMenuItem("Medico");
		mnABMProducto.add(mntmMedico);
		
		JMenuItem mntmABMProveedor = new JMenuItem("ABM Proveedor");
		mnArchivos.add(mntmABMProveedor);
		
		JMenuItem mntmABMTipoProveedor = new JMenuItem("ABM Tipo Proveedor");
		mnArchivos.add(mntmABMTipoProveedor);
		
		JMenuItem mntmABMVeterinario = new JMenuItem("ABM Veterinario");
		mnArchivos.add(mntmABMVeterinario);
		
		JMenuItem mntmABMSucursal = new JMenuItem("ABM Sucursal");
		mnArchivos.add(mntmABMSucursal);
		
		JMenuItem mntmABMQuirofano = new JMenuItem("ABM Quirofano");
		mnArchivos.add(mntmABMQuirofano);
		
		JMenuItem mntmABMArtefacto = new JMenuItem("ABM Artefacto");
		mnArchivos.add(mntmABMArtefacto);
		
		JMenuItem mntmABMCiudad = new JMenuItem("ABM Ciudad");
		mnArchivos.add(mntmABMCiudad);
		
		JMenuItem mntmABMProvincia = new JMenuItem("ABM Provincia");
		mnArchivos.add(mntmABMProvincia);
		
		JMenuItem mntmABMPais = new JMenuItem("ABM País");
		mnArchivos.add(mntmABMPais);
		
		JMenuItem mntmABMGestor = new JMenuItem("ABM Gestor");
		mnArchivos.add(mntmABMGestor);
		
		JMenuItem mntmABMUsuario = new JMenuItem("ABM Usuario");
		mnArchivos.add(mntmABMUsuario);
		
		JMenuItem mntmABMCita = new JMenuItem("ABM Cita");
		mnArchivos.add(mntmABMCita);
		
		JMenuItem mntmABMVisita = new JMenuItem("ABM Visita");
		mnArchivos.add(mntmABMVisita);
		
		JMenuItem mntmABMIntervencion = new JMenuItem("ABM Intervencion");
		mnArchivos.add(mntmABMIntervencion);
		
		JMenuItem mntmHistorialesMedicos = new JMenuItem("Historiales médicos");
		mntmHistorialesMedicos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmHistorialesMedicos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
