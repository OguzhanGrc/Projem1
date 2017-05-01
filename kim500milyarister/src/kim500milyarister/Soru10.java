package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Soru10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	

	private JButton btn125;
	private JButton btn60;
	private JButton btnotuz;
	private JButton btn15000;
	private JButton btn7500;
	private JButton btn5000;
	private JButton btn3000;
	private JButton btn2000;
	private JButton btn1000;
	private JButton btn500;
	private JButton btn0tl;
	private JButton btnmilyon;
	private JButton btn250;
	private JButton btna;
	private JButton btnb;
	private JButton btnc;
	private JButton btnd;
	private JButton btnsýradaki;
	private JLabel lblNewLabel;
	private JButton btnbasla;
	
	int sayi=0;
	private JButton btnyuzde;
	private JButton btncekil;
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru10 frame = new Soru10();
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
	public Soru10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btncekil = new JButton("\u00C7ekil");
		btncekil.setVisible(false);
		btncekil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnb.setVisible(false);
				btnc.setVisible(false);
				btnd.setVisible(false);
			btna.setVisible(false);
				btnbasla.setVisible(false);
				btn0tl.setBackground(Color.GREEN);
				
				btn500.setBackground(Color.GREEN);
				btn1000.setBackground(Color.GREEN);
				btn2000.setBackground(Color.GREEN);
				btn3000.setBackground(Color.GREEN);
				btn5000.setBackground(Color.GREEN);
				btn7500.setBackground(Color.GREEN);
				btn15000.setBackground(Color.GREEN);
				btnotuz.setBackground(Color.GREEN);
				btn60.setBackground(Color.GREEN);
				
				 JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 60.000 TL KAZANDINIZ. DOÐRU CEVAP: A", "Durum", JOptionPane.PLAIN_MESSAGE);
				 Timer zamanlayýcý2=new Timer();
					
					TimerTask görev3=new  TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
						
								btna.setBackground(Color.ORANGE);
								
								
								
							
						}
					};
					zamanlayýcý2.schedule(görev3, 0, 100000);
					Timer zamanlayýcý3=new Timer();
					TimerTask görev4= new TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							//btn500.setBackground(Color.GREEN);
						
							
							btna.setBackground(Color.GREEN);
							
							
							
							
							
						}
					}; zamanlayýcý3.schedule(görev4, 1200,250);
					
					
					Timer zamanlayýcý4=new Timer();
					TimerTask görev5=new TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							btna.setBackground(Color.BLACK);

		                           sayi++;
							if(sayi==8){
								zamanlayýcý4.cancel();
							}
						}
					}; zamanlayýcý4.schedule(görev5,1400,250);
			}
		});
		btncekil.setBackground(Color.GRAY);
		btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncekil.setBounds(55, 575, 130, 57);
		contentPane.add(btncekil);
		
		JButton button = new JButton("S");
		button.setFont(new Font("Tahoma", Font.BOLD, 9));
		button.setBackground(Color.GREEN);
		button.setBounds(66, 212, 49, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("I");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(125, 212, 49, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("N");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(184, 212, 52, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("I");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(246, 212, 52, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("S");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(308, 212, 47, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("I");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(365, 212, 49, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Z");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(424, 212, 44, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("S");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(152, 263, 59, 44);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u00DC");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(221, 263, 59, 44);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("R");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBackground(Color.GREEN);
		button_9.setBounds(290, 263, 49, 44);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("E");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBackground(Color.GREEN);
		button_10.setBounds(349, 263, 55, 44);
		contentPane.add(button_10);
		
		 btna = new JButton("A) 4 Eyl\u00FCl");
		 btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(97, 431, 125, 49);
		btna.setVisible(false);
		btna.addActionListener(this);
		contentPane.add(btna);
		
		 btnb = new JButton("B) 3 Ocak");
		 btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.addActionListener(this);
		btnb.setVisible(false);	
		btnb.setBounds(365, 427, 130, 56);
		contentPane.add(btnb);
		
		 btnc = new JButton("C) 17 Mart");
		 btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(97, 516, 125, 49);
		btnc.setVisible(false);
		btnc.addActionListener(this);
		contentPane.add(btnc);
		
		 btnd = new JButton("D) 8 Temmuz");
		 btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(370, 512, 125, 56);
		btnd.setVisible(false);
		btnd.addActionListener(this);
		contentPane.add(btnd);
		
		 btnsýradaki = new JButton("S\u0131radaki Soru");
		 btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setBounds(442, 583, 125, 49);
		btnsýradaki.setVisible(false);
		btnsýradaki.addActionListener(this);
		contentPane.add(btnsýradaki);
		
		 btnbasla = new JButton("");
		 btnbasla.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btna.setVisible(true);
		 		btnb.setVisible(true);
		 		btnc.setVisible(true);
		 		btnd.setVisible(true);
		 		btncekil.setVisible(true);
		 		lblNewLabel.setVisible(true);
		 		
		 	}
		 });
		btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		btnbasla.setBounds(10, 152, 230, 49);
		contentPane.add(btnbasla);
		
		 btnyuzde = new JButton("%50 Joker");
		 btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnyuzde.setBackground(Color.YELLOW);
		 btnyuzde.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnb.setVisible(false);
		 		btnd.setVisible(false);
		 		
		 	}
		 });
		btnyuzde.setBounds(370, 92, 125, 49);
		contentPane.add(btnyuzde);
		
		 btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(559, 11, 155, 44);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(589, 58, 125, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(599, 105, 115, 36);
		contentPane.add(btn125);
		
	 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(609, 152, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(609, 198, 105, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(609, 254, 105, 39);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(619, 308, 95, 39);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(619, 358, 95, 36);
		contentPane.add(btn5000);
		
		btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(619, 409, 95, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(629, 456, 85, 36);
		contentPane.add(btn2000);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(629, 515, 81, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(647, 575, 67, 23);
		contentPane.add(btn500);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(647, 609, 67, 23);
		contentPane.add(btn0tl);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(55, 318, 473, 87);
		contentPane.add(panel);
		 panel.setLayout(null);
		
		 lblNewLabel = new JLabel("Hayvanlar\u0131 koruma g\u00FCn\u00FC hangi g\u00FCnd\u00FCr ?");
		 lblNewLabel.setBounds(38, 30, 307, 19);
		 panel.add(lblNewLabel);
		 lblNewLabel.setForeground(Color.RED);
		 lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel.setVisible(false);
		 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setForeground(Color.WHITE);
		 lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		 lblNewLabel_1.setBounds(-217, -58, 954, 826);
		 contentPane.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("K\u0130M 1.000.000 TL \u0130STER ?");
		 lblNewLabel_2.setForeground(Color.WHITE);
		 lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		 lblNewLabel_2.setBounds(142, 14, 595, 67);
		 contentPane.add(lblNewLabel_2);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi= basýlanbuton.getText();
		
		switch (butonismi) {
		
		case "A) 4 Eylül" :
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btnc.setVisible(false);
			btnd.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
			
			REnkler();
Timer zamanlayýcý2=new Timer();
			
			TimerTask görev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btna.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý2.schedule(görev3, 0, 100000);
			Timer zamanlayýcý3=new Timer();
			TimerTask görev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
					
					btna.setBackground(Color.GREEN);
					
					
					
					
					
				}
			}; zamanlayýcý3.schedule(görev4, 1200,250);
			
			
			Timer zamanlayýcý4=new Timer();
			TimerTask görev5=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btna.setBackground(Color.BLACK);

                           sayi++;
					if(sayi==8){
						zamanlayýcý4.cancel();
					}
				}
			}; zamanlayýcý4.schedule(görev5,1400,250);
			Timer zaman5=new Timer();
			TimerTask görevödül=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btn0tl.setBackground(Color.GREEN);
				
					btn500.setBackground(Color.GREEN);
					btn1000.setBackground(Color.GREEN);
					btn2000.setBackground(Color.GREEN);
					btn3000.setBackground(Color.GREEN);
					btn5000.setBackground(Color.GREEN);
					btn7500.setBackground(Color.GREEN);
					btn15000.setBackground(Color.GREEN);
					btnotuz.setBackground(Color.GREEN);
					btn60.setBackground(Color.GREEN);
					btn125.setBackground(Color.GREEN);
					btnsýradaki.setVisible(true);
				}
			};zaman5.schedule(görevödül, 1200, 1);
			
			
			
			
			break;
case "B) 3 Ocak" :
	btnbasla.setVisible(false);
	btna.setVisible(false);
	btnc.setVisible(false);
	btnd.setVisible(false);
	btnyuzde.setVisible(false);
	btncekil.setVisible(false);
	REnkler();

	 Timer zamanlayýcý6=new Timer();
	
	TimerTask görev8=new  TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
				btnb.setBackground(Color.ORANGE);
				
				
				
			
		}
	};
	zamanlayýcý6.schedule(görev8, 0, 100000);
	TimerTask görev9 =new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			btnb.setBackground(Color.RED);
			
			
			JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
			btn15000.setBackground(Color.GREEN);
			
		}
	}; zamanlayýcý6.schedule(görev9, 5000, 10000);
	
	btnb.setBackground(Color.RED);
	
	
			break;
case "C) 17 Mart" :
	btnbasla.setVisible(false);
	btnb.setVisible(false);
	btna.setVisible(false);
	btnd.setVisible(false);
	btnyuzde.setVisible(false);
	btncekil.setVisible(false);
	REnkler();
	Timer zamanlayýcý333=new Timer();
	
	TimerTask görevax=new  TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
				btnc.setBackground(Color.ORANGE);
				
				
				
			
		}
	};
	zamanlayýcý333.schedule(görevax, 0, 100000);
	TimerTask görev91 =new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			btnc.setBackground(Color.RED);
			
			
			JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
			btn15000.setBackground(Color.GREEN);
			
		}
	}; zamanlayýcý333.schedule(görev91, 5000, 10000);
	
	btnc.setBackground(Color.RED);
	
	break;
case "D) 8 Temmuz" :
	btnbasla.setVisible(false);
	btnb.setVisible(false);
	btnc.setVisible(false);
	btna.setVisible(false);
	btnyuzde.setVisible(false);
	btncekil.setVisible(false);
	REnkler();
	
	  Timer zamanlayýcý678=new Timer();
		
		TimerTask görev89=new  TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
					btnd.setBackground(Color.ORANGE);
					
					
					
				
			}
		};
		zamanlayýcý678.schedule(görev89, 0, 100000);
		TimerTask görev98 =new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				btnd.setBackground(Color.RED);
				
				
				JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
				btn15000.setBackground(Color.GREEN);
				
			}
		}; zamanlayýcý678.schedule(görev98, 5000, 10000);
		
		btnd.setBackground(Color.RED);
		
	break;
case "Sýradaki Soru" :
	
	
	Soru11 soru11=new Soru11();
	soru11.setVisible(true);
	
	
	break;
	default :
		
		break;
		
		}
	}

public  void REnkler(){
		
		
		Timer zamanlayýcýx=new Timer();
	TimerTask görev0=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn0tl.setBackground(Color.ORANGE);
				
				
			}
		};zamanlayýcýx.schedule(görev0, 90, 10000);
		TimerTask görevx=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn500.setBackground(Color.ORANGE);
				
				
			}
		};zamanlayýcýx.schedule(görevx, 120, 100000);
		
		TimerTask görevy=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn1000.setBackground(Color.ORANGE);
			}
		}; zamanlayýcýx.schedule(görevy, 150, 10000);
		TimerTask görevz=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn2000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevz, 180, 10000);
		TimerTask göreva=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn3000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(göreva, 210, 10000);
	      TimerTask görevb=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn5000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevb, 240, 10000);
		
	TimerTask görevc=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn7500.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevc, 270, 10000);
		
	TimerTask görevd=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn15000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevd, 300, 10000);
		
	TimerTask göreve=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnotuz.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(göreve, 330, 10000);
	TimerTask görevf=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn60.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevf, 360, 10000);
	TimerTask görevg=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn125.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevg, 390, 10000);
	TimerTask görevh=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn250.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevh,420, 10000);
	TimerTask görevj=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnmilyon.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevj, 450, 10000);
	}
}
