package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Soru12 extends JFrame implements ActionListener{

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
	 private JLabel lblzengin;
	 private JPanel panel_1;
	 int sayi=0;
	private JButton btnyuzde;
	private JLabel lblNewLabel_1;
	private JButton btncekil;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru12 frame = new Soru12();
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
	public Soru12() {
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
				btnd.setVisible(false);
			btnc.setVisible(false);
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
			btn125.setBackground(Color.GREEN);
			btn250.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 250.000 TL KAZANDINIZ. DOÐRU CEVAP GÝZLÝDÝR.", "Durum", JOptionPane.PLAIN_MESSAGE);
			 Timer zamanlayýcý2=new Timer();
	   			
	   			TimerTask görev3=new  TimerTask() {
	   				
	   				@Override
	   				public void run() {
	   					// TODO Auto-generated method stub
	   				
	   						btnc.setBackground(Color.ORANGE);
	   						
	   						
	   						
	   					
	   				}
	   			};
	   			zamanlayýcý2.schedule(görev3, 0, 100000);
	   			Timer zamanlayýcý3=new Timer();
	   			TimerTask görev4= new TimerTask() {
	   				
	   				@Override
	   				public void run() {
	   					// TODO Auto-generated method stub
	   					//btn500.setBackground(Color.GREEN);
	   				
	   					
	   					btnc.setBackground(Color.GREEN);
	   					
	   					
	   					
	   					
	   					
	   				}
	   			}; zamanlayýcý3.schedule(görev4, 1200,250);
	   			
	   			
	   			Timer zamanlayýcý4=new Timer();
	   			TimerTask görev5=new TimerTask() {
	   				
	   				@Override
	   				public void run() {
	   					// TODO Auto-generated method stub
	   					btnc.setBackground(Color.BLACK);

	                             sayi++;
	   					if(sayi==8){
	   						zamanlayýcý4.cancel();
	   					}
	   				}
	   			}; zamanlayýcý4.schedule(görev5,1400,250);
				
			}
		});
		
		 panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setVisible(false);
		panel_1.setBounds(24, 50, 524, 188);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblzengin = new JLabel("TEBR\u0130KLER!!!! ARTIK B\u0130R M\u0130LYONERS\u0130N\u0130Z.   \r\n");
		lblzengin.setBackground(Color.ORANGE);
		lblzengin.setVisible(false);
		lblzengin.setBounds(24, 73, 465, 28);
		panel_1.add(lblzengin);
		lblzengin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncekil.setBackground(Color.GRAY);
		btncekil.setBounds(535, 570, 108, 55);
		contentPane.add(btncekil);
		
		JButton button = new JButton("S");
		button.setFont(new Font("Tahoma", Font.BOLD, 9));
		button.setBackground(Color.GREEN);
		button.setBounds(85, 236, 49, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("I");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(144, 236, 49, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("N");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(203, 236, 52, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("I");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(265, 236, 52, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("S");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(327, 236, 47, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("I");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(384, 236, 49, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Z");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(443, 236, 44, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("S");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(171, 287, 59, 44);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u00DC");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(240, 287, 59, 44);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("R");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBackground(Color.GREEN);
		button_9.setBounds(309, 287, 49, 44);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("E");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBackground(Color.GREEN);
		button_10.setBounds(368, 287, 55, 44);
		contentPane.add(button_10);
		
		btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(584, 0, 136, 44);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(605, 51, 115, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(615, 98, 105, 36);
		contentPane.add(btn125);
		
		 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(619, 143, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(629, 193, 95, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(629, 240, 95, 50);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(629, 301, 95, 39);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(629, 355, 95, 36);
		contentPane.add(btn5000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(629, 402, 95, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(629, 461, 95, 36);
		contentPane.add(btn2000);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(634, 508, 86, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(653, 568, 67, 23);
		contentPane.add(btn500);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(653, 602, 67, 23);
		contentPane.add(btn0tl);
		
		 btna = new JButton("A) E. Murat Bilgel");
		 btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.addActionListener(this);
		btna.setVisible(false);	
		btna.setBounds(50, 461, 205, 73);
		contentPane.add(btna);
		
		 btnb = new JButton("B) Erdal Ceylano\u011Flu");
		 btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(328, 461, 185, 73);
		btnb.addActionListener(this);
		btnb.setVisible(false);
		contentPane.add(btnb);
		
		 btnd = new JButton("D) B\u00FClent Olcay");
		 btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(328, 552, 185, 73);
		btnd.addActionListener(this);
		btnd.setVisible(false);
		contentPane.add(btnd);
		
		 btnc = new JButton("C ) B\u00FClent Bostano\u011Flu");
		 btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(50, 552, 205, 73);
		btnc.addActionListener(this);
		btnc.setVisible(false);
		contentPane.add(btnc);
		
		 btnbasla = new JButton("New button");
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
		btnbasla.setBounds(10, 127, 206, 52);
		contentPane.add(btnbasla);
		
		 btnyuzde = new JButton("%50 Joker");
		 btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnyuzde.setBackground(Color.YELLOW);
		 btnyuzde.setBounds(497, 186, 125, 52);
		contentPane.add(btnyuzde);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(38, 331, 489, 98);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("\u015Eu anki Deniz Kuvvetleri Komutan\u0131m\u0131z kimdir ?");
		lblNewLabel.setBounds(49, 31, 348, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-230, -12, 980, 750);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("SON SORU");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(228, 0, 556, 73);
		contentPane.add(lblNewLabel_2);
		lblNewLabel.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		switch (butonismi) {
		case "A) E. Murat Bilgel":
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
							
							JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : -- ", "Durum", JOptionPane.PLAIN_MESSAGE);
							btn15000.setBackground(Color.GREEN);
							
							
						}
					}; zamanlayýcý678.schedule(görev98, 5000, 10000);
					
					btna.setBackground(Color.RED);
				
				
				
				
				
			
			
			break;
        case "B) Erdal Ceylanoðlu":
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
   					
   					JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : -- ", "Durum", JOptionPane.PLAIN_MESSAGE);
   					btn15000.setBackground(Color.GREEN);
   					
   					
   				}
   			}; zamanlayýcý6.schedule(görev9, 5000, 10000);
   			
   			btnb.setBackground(Color.RED);
    	   
    	   
        	
        	
        	
        	
			break;
        case "C ) Bülent Bostanoðlu":
        	btnbasla.setVisible(false);
        	btnb.setVisible(false);
			btna.setVisible(false);
			btnd.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
        	REnkler();
       	  
       	  Timer zamanlayýcý2=new Timer();
   			
   			TimerTask görev3=new  TimerTask() {
   				
   				@Override
   				public void run() {
   					// TODO Auto-generated method stub
   				
   						btnc.setBackground(Color.ORANGE);
   						
   						
   						
   					
   				}
   			};
   			zamanlayýcý2.schedule(görev3, 0, 100000);
   			Timer zamanlayýcý3=new Timer();
   			TimerTask görev4= new TimerTask() {
   				
   				@Override
   				public void run() {
   					// TODO Auto-generated method stub
   					//btn500.setBackground(Color.GREEN);
   				
   					
   					btnc.setBackground(Color.GREEN);
   					
   					
   					
   					
   					
   				}
   			}; zamanlayýcý3.schedule(görev4, 1200,250);
   			
   			
   			Timer zamanlayýcý4=new Timer();
   			TimerTask görev5=new TimerTask() {
   				
   				@Override
   				public void run() {
   					// TODO Auto-generated method stub
   					btnc.setBackground(Color.BLACK);

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
//   					btn0tl.setBackground(Color.GREEN);
//   				
//   					btn500.setBackground(Color.GREEN);
//   					btn1000.setBackground(Color.GREEN);
//   					btn2000.setBackground(Color.GREEN);
//   					btn3000.setBackground(Color.GREEN);
//   					btn5000.setBackground(Color.GREEN);
//   					btn7500.setBackground(Color.GREEN);
//   					btn15000.setBackground(Color.GREEN);
//   					btnotuz.setBackground(Color.GREEN);
//   					btn60.setBackground(Color.GREEN);
//   					btn125.setBackground(Color.GREEN);
//   					btn250.setBackground(Color.GREEN);
//   					btnmilyon.setBackground(Color.GREEN);
   					
   					
   					REnkler2();
   					lblzengin.setVisible(true);
   					panel_1.setVisible(true);
   				}
   			};zaman5.schedule(görevödül, 1200, 1);
       	  
       	  
        	
        	
        	
        	
        	
	break;
        case "D) Bülent Olcay":
        	btnbasla.setVisible(false);
        	btnb.setVisible(false);
			btnc.setVisible(false);
			btna.setVisible(false);
			btnyuzde.setVisible(false);
			btncekil.setVisible(false);
        	REnkler();
        	  
        	  Timer zamanlayýcý333=new Timer();
    			
    			TimerTask görevax=new  TimerTask() {
    				
    				@Override
    				public void run() {
    					// TODO Auto-generated method stub
    					
    						btnd.setBackground(Color.ORANGE);
    						
    						
    						
    					
    				}
    			};
    			zamanlayýcý333.schedule(görevax, 0, 100000);
    			TimerTask görev91 =new TimerTask() {
    				
    				@Override
    				public void run() {
    					// TODO Auto-generated method stub
    					
    					btnd.setBackground(Color.RED);
    					
    					
    					JOptionPane.showMessageDialog(null, " 2. Barajý geçtiðiniz için Ödülünüz 15000 TL. Doðru þýk : -- ", "Durum", JOptionPane.PLAIN_MESSAGE);			
    					btn15000.setBackground(Color.GREEN);
    					
    				}
    			}; zamanlayýcý333.schedule(görev91, 5000, 10000);
    			
    			btnd.setBackground(Color.RED);
        	  
        	  
        	
        	
        	
        	
	break;
        case "":
	
        	
        	
        	
        	
        	
	break;
		default:
			break;
		}
		
		
		
		
	}
	
public  void REnkler2(){
		
		
		Timer zamanlayýcýx=new Timer();
	TimerTask görev0=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn0tl.setBackground(Color.GREEN);
				
				
			}
		};zamanlayýcýx.schedule(görev0, 90, 10000);
		TimerTask görevx=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn500.setBackground(Color.GREEN);
				
				
			}
		};zamanlayýcýx.schedule(görevx, 120, 100000);
		
		TimerTask görevy=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn1000.setBackground(Color.GREEN);
			}
		}; zamanlayýcýx.schedule(görevy, 150, 10000);
		TimerTask görevz=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn2000.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevz, 180, 10000);
		TimerTask göreva=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn3000.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(göreva, 210, 10000);
	      TimerTask görevb=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn5000.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevb, 240, 10000);
		
	TimerTask görevc=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn7500.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevc, 270, 10000);
		
	TimerTask görevd=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn15000.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevd, 300, 10000);
		
	TimerTask göreve=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnotuz.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(göreve, 330, 10000);
	TimerTask görevf=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn60.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevf, 360, 10000);
	TimerTask görevg=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn125.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevg, 390, 10000);
	TimerTask görevh=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn250.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevh,420, 10000);
	TimerTask görevj=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnmilyon.setBackground(Color.GREEN);
			}
		};zamanlayýcýx.schedule(görevj, 450, 10000);
	

TimerTask görev000=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btnmilyon.setBackground(Color.ORANGE);
			
			
		}
	};zamanlayýcýx.schedule(görev000,480,10000);
	TimerTask görevxx=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn250.setBackground(Color.ORANGE);
			
			
		}
	};zamanlayýcýx.schedule(görevxx, 510, 100000);
	
	TimerTask görevyy=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn125.setBackground(Color.ORANGE);
		}
	}; zamanlayýcýx.schedule(görevyy, 540, 10000);
	TimerTask görevzzz=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn60.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevzzz, 570, 10000);
	TimerTask görevaaa=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btnotuz.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevaaa, 600, 10000);
      TimerTask görevbbbb=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn15000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevbbbb, 630, 10000);
	
TimerTask görevc1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn7500.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevc1, 660, 10000);
	
TimerTask görevd1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn5000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevd1, 690, 10000);
	
TimerTask göreve1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn3000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(göreve1, 710, 10000);
TimerTask görevf1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn2000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevf1, 740, 10000);
TimerTask görevg1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn1000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevg1, 770, 10000);
TimerTask görevh1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn500.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevh1,800, 10000);
TimerTask görevj1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn0tl.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevj1, 830, 10000);
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
