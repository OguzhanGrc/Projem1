package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Soru8 extends JFrame implements ActionListener {

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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btncekil;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru8 frame = new Soru8();
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
	public Soru8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 692);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btncekil = new JButton("\u00C7ekil");
		btncekil.setVisible(false);
		btncekil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btna.setVisible(false);
				btnb.setVisible(false);
				btnc.setVisible(false);
				btnd.setVisible(false);
				btn0tl.setBackground(Color.GREEN);
				
				btn500.setBackground(Color.GREEN);
				btn1000.setBackground(Color.GREEN);
				btn2000.setBackground(Color.GREEN);
				btn3000.setBackground(Color.GREEN);
				btn5000.setBackground(Color.GREEN);
			    btn7500.setBackground(Color.GREEN);
			    btn15000.setBackground(Color.GREEN);
			    btnbasla.setVisible(false);
			    JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 15.000 TL KAZANDINIZ. DOÐRU CEVAP: D", "Durum", JOptionPane.PLAIN_MESSAGE);
			    Timer zamanlayýcý2=new Timer();
				
				TimerTask görev3=new  TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
							btnd.setBackground(Color.ORANGE);
							
							
							
						
					}
				};
				zamanlayýcý2.schedule(görev3, 0, 100000);
				Timer zamanlayýcý3=new Timer();
				TimerTask görev4= new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//btn500.setBackground(Color.GREEN);
					
						
						btnd.setBackground(Color.GREEN);
						
						
						
						
						
					}
				}; zamanlayýcý3.schedule(görev4, 1200,250);
				
				
				Timer zamanlayýcý4=new Timer();
				TimerTask görev5=new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btnd.setBackground(Color.BLACK);

	                           sayi++;
						if(sayi==8){
							zamanlayýcý4.cancel();
						}
					}
				}; zamanlayýcý4.schedule(görev5,1400,250);
			}
		});
		
		JButton btncift = new JButton("\u00C7\u0130FT CEVAP");
		btncift.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncift.setBounds(279, 75, 109, 62);
		contentPane.add(btncift);
		btncekil.setBackground(Color.GRAY);
		btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncekil.setBounds(456, 467, 128, 47);
		contentPane.add(btncekil);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnS.setBackground(Color.GREEN);
		btnS.setBounds(87, 195, 49, 39);
		contentPane.add(btnS);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnI.setBackground(Color.GREEN);
		btnI.setBounds(146, 195, 49, 39);
		contentPane.add(btnI);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnN.setBackground(Color.GREEN);
		btnN.setBounds(205, 195, 52, 39);
		contentPane.add(btnN);
		
		JButton btnI_1 = new JButton("I");
		btnI_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnI_1.setBackground(Color.GREEN);
		btnI_1.setBounds(267, 195, 52, 39);
		contentPane.add(btnI_1);
		
		JButton button_3 = new JButton("S");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(329, 195, 47, 39);
		contentPane.add(button_3);
		
		JButton btnI_2 = new JButton("I");
		btnI_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnI_2.setBackground(Color.GREEN);
		btnI_2.setBounds(386, 195, 49, 39);
		contentPane.add(btnI_2);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnZ.setBackground(Color.GREEN);
		btnZ.setBounds(445, 195, 44, 39);
		contentPane.add(btnZ);
		
		JButton button_6 = new JButton("S");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(173, 246, 59, 44);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("\u00DC");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(242, 246, 59, 44);
		contentPane.add(button_7);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnR.setBackground(Color.GREEN);
		btnR.setBounds(311, 246, 49, 44);
		contentPane.add(btnR);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnE.setBackground(Color.GREEN);
		btnE.setBounds(370, 246, 55, 44);
		contentPane.add(btnE);
		
		 btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(606, 11, 119, 36);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(610, 58, 105, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(610, 105, 105, 36);
		contentPane.add(btn125);
		
		btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(610, 152, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(610, 198, 105, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(610, 254, 105, 36);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(610, 301, 105, 46);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(610, 358, 105, 36);
		contentPane.add(btn5000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(610, 409, 105, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(610, 456, 105, 36);
		contentPane.add(btn2000);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(625, 515, 86, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(629, 570, 67, 23);
		contentPane.add(btn500);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(629, 609, 67, 23);
		contentPane.add(btn0tl);
		
		 btna = new JButton("A) Jupiter");
		 btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(67, 475, 123, 57);
		btna.addActionListener(this);
		btna.setVisible(false);
		contentPane.add(btna);
		
		 btnb = new JButton("B Nept\u00FCn");
		 btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(287, 475, 123, 57);
		btnb.addActionListener(this);
		btnb.setVisible(false);
		
		contentPane.add(btnb);
		
		 btnc = new JButton("C) Merk\u00FCr");
		 btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(67, 570, 123, 57);
		btnc.setVisible(false);
		btnc.addActionListener(this);
		
		contentPane.add(btnc);
		
		 btnd = new JButton("D) Sat\u00FCrn");
		 btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnd.setBounds(287, 570, 123, 57);
		 btnd.addActionListener(this);
		 btnd.setVisible(false);
		
		contentPane.add(btnd);
		
		 btnsýradaki = new JButton("S\u0131radaki Soru");
		 btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnsýradaki.setBackground(Color.CYAN);
		 btnsýradaki.setBounds(450, 570, 123, 57);
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
		btnbasla.setBounds(10, 79, 210, 62);
		contentPane.add(btnbasla);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(62, 311, 478, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 lblNewLabel = new JLabel("\u00D6zk\u00FCtlesi sudan daha hafif olan gezegen hangisidir ? ");
		lblNewLabel.setBounds(34, 50, 434, 20);
		lblNewLabel.setVisible(false);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		btnyuzde = new JButton("%50 Joker");
		btnyuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btna.setVisible(false);
				btnb.setVisible(false);
				
				
			}
		});
		btnyuzde.setBackground(Color.YELLOW);
		btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnyuzde.setBounds(421, 72, 134, 69);
		contentPane.add(btnyuzde);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-201, 0, 939, 719);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("K\u0130M 1000000 \u0130STER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(173, 21, 507, 47);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		

		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		switch (butonismi) {
		case "A) Jupiter" :
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btnc.setVisible(false);
			btnd.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
			REnkler();
			 Timer zamanlayýcý678=new Timer();
				
				TimerTask görev89=new  TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
							btna.setBackground(Color.ORANGE);
							
							
							
						
					}
				};
				zamanlayýcý678.schedule(görev89, 0, 100000);
				TimerTask görev98 =new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						btna.setBackground(Color.RED);
						
						JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : D ", "Durum", JOptionPane.PLAIN_MESSAGE);
						
						btn15000.setBackground(Color.GREEN);
						
					}
				}; zamanlayýcý678.schedule(görev98, 5000, 10000);
				
				btna.setBackground(Color.RED);
			
			
			
			
			
		break;
		case "B Neptün" :
			btnbasla.setVisible(false);
			btna.setVisible(false);
			btnc.setVisible(false);
			btnd.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
			REnkler();
	       	  Timer zamanlayýcý333=new Timer();
	 			
	 			TimerTask görevax=new  TimerTask() {
	 				
	 				@Override
	 				public void run() {
	 					// TODO Auto-generated method stub
	 					
	 						btnb.setBackground(Color.ORANGE);
	 						
	 						
	 						
	 					
	 				}
	 			};
	 			zamanlayýcý333.schedule(görevax, 0, 100000);
	 			TimerTask görev91 =new TimerTask() {
	 				
	 				@Override
	 				public void run() {
	 					// TODO Auto-generated method stub
	 					
	 					btnb.setBackground(Color.RED);
	 					
	 					JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : D ", "Durum", JOptionPane.PLAIN_MESSAGE);
	 					
	 					btn15000.setBackground(Color.GREEN);
	 					
	 				}
	 			}; zamanlayýcý333.schedule(görev91, 5000, 10000);
	 			
	 			btnb.setBackground(Color.RED);
	 			
	         	
	         	
	       	  
	    	   
	    	   
	    	   
	    	   
	    	   
			
			
			
			
			
			break;
		case "C) Merkür" :
			
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btna.setVisible(false);
			btnd.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
			REnkler();
	       	  Timer zamanlayýcý3338=new Timer();
	 			
	 			TimerTask görevax6=new  TimerTask() {
	 				
	 				@Override
	 				public void run() {
	 					// TODO Auto-generated method stub
	 					
	 						btnc.setBackground(Color.ORANGE);
	 						
	 						
	 						
	 					
	 				}
	 			};
	 			zamanlayýcý3338.schedule(görevax6, 0, 100000);
	 			TimerTask görev910 =new TimerTask() {
	 				
	 				@Override
	 				public void run() {
	 					// TODO Auto-generated method stub
	 					
	 					btnc.setBackground(Color.RED);
	 					JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : D ", "Durum", JOptionPane.PLAIN_MESSAGE);
	 					
	 					btn15000.setBackground(Color.GREEN);
	 					
	 					
	 				}
	 			}; zamanlayýcý3338.schedule(görev910, 5000, 10000);
	 			
	 			btnc.setBackground(Color.RED);
       	
       	
       	
       	
			
			
			
			
			
			
			
			break;
		case "D) Satürn" :
			
			btnb.setVisible(false);
			btnc.setVisible(false);
			btna.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
			btnbasla.setVisible(false);
			REnkler();
       	 
       	 Timer zamanlayýcý2=new Timer();
			
			TimerTask görev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btnd.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý2.schedule(görev3, 0, 100000);
			Timer zamanlayýcý3=new Timer();
			TimerTask görev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
					
					btnd.setBackground(Color.GREEN);
					
					
					
					
					
				}
			}; zamanlayýcý3.schedule(görev4, 1200,250);
			
			
			Timer zamanlayýcý4=new Timer();
			TimerTask görev5=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btnd.setBackground(Color.BLACK);

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
					btnsýradaki.setVisible(true);
				}
			};zaman5.schedule(görevödül, 1200, 1);
       	 
       	 
			
			
			
			
			break;
		case "Sýradaki Soru" :
			
			Soru9 soru9=new Soru9();
			soru9.setVisible(true);
			
			
			
			
			
			
			
			
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
