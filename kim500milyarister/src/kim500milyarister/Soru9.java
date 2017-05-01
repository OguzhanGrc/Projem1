package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Soru9 extends JFrame implements ActionListener {

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
	private JPanel panel;
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
					Soru9 frame = new Soru9();
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
	public Soru9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 691);
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
				
				  JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 30.000 TL KAZANDINIZ. DOÐRU CEVAP: D", "Durum", JOptionPane.PLAIN_MESSAGE);
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
		btncekil.setBackground(Color.GRAY);
		btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncekil.setBounds(505, 462, 94, 62);
		contentPane.add(btncekil);
		
		JButton button = new JButton("S");
		button.setFont(new Font("Tahoma", Font.BOLD, 9));
		button.setBackground(Color.GREEN);
		button.setBounds(121, 195, 49, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("I");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(180, 195, 49, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("N");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(239, 195, 52, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("I");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(301, 195, 52, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("S");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(363, 195, 47, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("I");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(420, 195, 49, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Z");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(479, 195, 44, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("S");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(207, 246, 59, 44);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u00DC");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(276, 246, 59, 44);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("R");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBackground(Color.GREEN);
		button_9.setBounds(345, 246, 49, 44);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("E");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBackground(Color.GREEN);
		button_10.setBounds(404, 246, 55, 44);
		contentPane.add(button_10);
		
		 btnbasla = new JButton("");
		 btnbasla.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		btna.setVisible(true);
		 		btnb.setVisible(true);
		 		btnc.setVisible(true);
		 		btnd.setVisible(true);
		 		lblNewLabel.setVisible(true);
		 		btncekil.setVisible(true);
		 		
		 	}
		 });
		btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		btnbasla.setBounds(10, 76, 210, 62);
		
		contentPane.add(btnbasla);
		
		 btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(605, 0, 119, 36);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(609, 47, 105, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(609, 94, 105, 36);
		contentPane.add(btn125);
		
		 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(609, 141, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(609, 187, 105, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(609, 243, 105, 36);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(609, 290, 105, 46);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(609, 347, 105, 36);
		contentPane.add(btn5000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(609, 398, 105, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(609, 445, 105, 36);
		contentPane.add(btn2000);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(624, 504, 86, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(628, 559, 67, 23);
		contentPane.add(btn500);
		
	 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(628, 598, 67, 23);
		contentPane.add(btn0tl);
		
		 btna = new JButton("A) 01.01.2006");
		 btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(132, 462, 130, 62);
		btna.addActionListener(this);
		btna.setVisible(false);
		contentPane.add(btna);
		
		 btnb = new JButton("B) 01.01.2007");
		 btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(349, 462, 130, 62);
		btnb.addActionListener(this);
		btnb.setVisible(false);
		
		contentPane.add(btnb);
		
		 btnc = new JButton("C) 12.12.2008");
		 btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(132, 559, 130, 62);
		btnc.addActionListener(this);
		btnc.setVisible(false);
		
		contentPane.add(btnc);
		
		 btnd = new JButton("D) 01.01.2009");
		 btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(349, 559, 130, 62);
		btnd.setVisible(false);
		btnd.addActionListener(this);
		
		contentPane.add(btnd);
		
		btnsýradaki = new JButton("S\u0131radaki Soru");
		btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnsýradaki.setBounds(488, 559, 130, 62);
		btnsýradaki.setVisible(false);
		btnsýradaki.addActionListener(this);
		contentPane.add(btnsýradaki);
		
		 lblNewLabel = new JLabel("Yeni T\u00FCrk Lira\u2019s\u0131ndaki \u201CYeni\u201D s\u00F6zc\u00FC\u011F\u00FC hangi tarihte at\u0131lm\u0131\u015Ft\u0131r?");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setVisible(false);
		lblNewLabel.setBounds(92, 339, 470, 70);
		contentPane.add(lblNewLabel);
		
		btnyuzde = new JButton("%50 Joker");
		btnyuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btna.setVisible(false);
				btnb.setVisible(false);
			}
		});
		btnyuzde.setBackground(Color.YELLOW);
		btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnyuzde.setBounds(404, 68, 125, 70);
		contentPane.add(btnyuzde);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(80, 318, 482, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-190, 0, 914, 707);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("K\u0130M 1000000 \u0130STER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(191, 0, 676, 65);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		switch (butonismi) {
		case "A) 01.01.2006":
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
       
		case "B) 01.01.2007":
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
        
		case "C) 12.12.2008":
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
       
		case "D) 01.01.2009":
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btnc.setVisible(false);
			btna.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
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
						btn60.setBackground(Color.GREEN);
						btnsýradaki.setVisible(true);
					}
				};zaman5.schedule(görevödül, 1200, 1);
	       	 
	       	 
				
	break;
       
		case "Sýradaki Soru":
	
			Soru10 soru10=new Soru10();
			soru10.setVisible(true);
			
			
	break; 
		
		default:
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
