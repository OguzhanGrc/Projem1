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
import javax.swing.ImageIcon;

public class Soru11 extends JFrame implements ActionListener {

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
	private JButton btns�radaki;
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
					Soru11 frame = new Soru11();
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
	public Soru11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 690);
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
				btnc.setVisible(false);
				btnd.setVisible(false);
				btnb.setVisible(false);
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
				JOptionPane.showMessageDialog(null, "TEBR�KLER!!! 125.000 TL KAZANDINIZ. DO�RU CEVAP: B", "Durum", JOptionPane.PLAIN_MESSAGE);
				Timer zamanlay�c�2=new Timer();
				
	  			TimerTask g�rev3=new  TimerTask() {
	  				
	  				@Override
	  				public void run() {
	  					// TODO Auto-generated method stub
	  				
	  						btnb.setBackground(Color.ORANGE);
	  						
	  						
	  						
	  					
	  				}
	  			};
	  			zamanlay�c�2.schedule(g�rev3, 0, 100000);
	  			Timer zamanlay�c�3=new Timer();
	  			TimerTask g�rev4= new TimerTask() {
	  				
	  				@Override
	  				public void run() {
	  					// TODO Auto-generated method stub
	  					//btn500.setBackground(Color.GREEN);
	  				
	  					
	  					btnb.setBackground(Color.GREEN);
	  					
	  					
	  					
	  					
	  					
	  				}
	  			}; zamanlay�c�3.schedule(g�rev4, 1200,250);
	  			
	  			
	  			Timer zamanlay�c�4=new Timer();
	  			TimerTask g�rev5=new TimerTask() {
	  				
	  				@Override
	  				public void run() {
	  					// TODO Auto-generated method stub
	  					btnb.setBackground(Color.BLACK);

	                             sayi++;
	  					if(sayi==8){
	  						zamanlay�c�4.cancel();
	  					}
	  				}
	  			}; zamanlay�c�4.schedule(g�rev5,1400,250);
			}
		});
		btncekil.setBackground(Color.GRAY);
		btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncekil.setBounds(449, 424, 117, 60);
		contentPane.add(btncekil);
		
		JButton button = new JButton("S");
		button.setFont(new Font("Tahoma", Font.BOLD, 9));
		button.setBackground(Color.GREEN);
		button.setBounds(49, 175, 49, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("I");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(108, 175, 49, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("N");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(167, 175, 52, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("I");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(229, 175, 52, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("S");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(291, 175, 47, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("I");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(348, 175, 49, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Z");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(407, 175, 44, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("S");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(135, 226, 59, 44);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u00DC");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(204, 226, 59, 44);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("R");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBackground(Color.GREEN);
		button_9.setBounds(273, 226, 49, 44);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("E");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBackground(Color.GREEN);
		button_10.setBounds(332, 226, 55, 44);
		contentPane.add(button_10);
		
		 btnmilyon = new JButton("1000000 TL");	
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(584, 15, 136, 44);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(605, 66, 115, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(615, 113, 105, 36);
		contentPane.add(btn125);
		
		 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(619, 158, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(629, 208, 95, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(629, 255, 95, 50);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(629, 316, 95, 39);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(629, 370, 95, 36);
		contentPane.add(btn5000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(629, 417, 95, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(629, 476, 95, 36);
		contentPane.add(btn2000);
		
		btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(634, 523, 86, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(653, 583, 67, 23);
		contentPane.add(btn500);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(653, 617, 67, 23);
		contentPane.add(btn0tl);
		
		 btna = new JButton("A) \u0130rlanda");
		 btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(56, 424, 136, 60);
	    btna.addActionListener(this);
		btna.setVisible(false);
		contentPane.add(btna);
		
		 btnb = new JButton("B) \u0130sko\u00E7ya");
		 btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(264, 424, 136, 60);
		btnb.setVisible(false);
		btnb.addActionListener(this);
		contentPane.add(btnb);
		
		 btnc = new JButton("C) \u0130ngiltere");
		 btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(58, 517, 136, 60);
		btnc.addActionListener(this);
		btnc.setVisible(false);
		
		contentPane.add(btnc);
		
		 btnd = new JButton("D) L\u00FCksemburg");
		 btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(264, 517, 136, 60);
		btnd.setVisible(false);
		btnd.addActionListener(this);
		
		contentPane.add(btnd);
		
		 btns�radaki = new JButton("Milyonluk Soru");
		 btns�radaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btns�radaki.setBackground(Color.CYAN);
		btns�radaki.setBounds(430, 523, 136, 60);
		btns�radaki.addActionListener(this);
		btns�radaki.setVisible(false);
		
		contentPane.add(btns�radaki);
		
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
		btnbasla.setBounds(28, 95, 230, 49);
	
		contentPane.add(btnbasla);
		
		 btnyuzde = new JButton("%50 Joker");
		 btnyuzde.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		btnc.setVisible(false);
		 		btnd.setVisible(false);
		 	}
		 });
		btnyuzde.setIcon(null);
		btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnyuzde.setBackground(Color.YELLOW);
		btnyuzde.setBounds(388, 95, 125, 49);
		
		contentPane.add(btnyuzde);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 290, 503, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 lblNewLabel = new JLabel("D\u00FCnyada insanlar\u0131 cimri olarak adland\u0131r\u0131lan \u00FClke hangisidir? ");
		 lblNewLabel.setBounds(29, 11, 488, 87);
		 panel.add(lblNewLabel);
		 lblNewLabel.setForeground(Color.RED);
		 lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		 
		 lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		 lblNewLabel_1.setBounds(-249, -48, 1014, 823);
		 contentPane.add(lblNewLabel_1);
		 
		 lblNewLabel_2 = new JLabel("K\u0130M 1.000.000 TL \u0130STER");
		 lblNewLabel_2.setForeground(Color.WHITE);
		 lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		 lblNewLabel_2.setBounds(140, -4, 566, 75);
		 contentPane.add(lblNewLabel_2);
		 lblNewLabel.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton bas�lanbuton=(JButton) e.getSource();
		String butonismi= bas�lanbuton.getText();
		
		switch (butonismi){
		
		
		   case "A) �rlanda":
			   btnbasla.setVisible(false);
			  btnb.setVisible(false);
			  btnc.setVisible(false);
			  btnd.setVisible(false);
			  btnyuzde.setVisible(false);
			  btncekil.setVisible(false);
			   REnkler();
				 Timer zamanlay�c�678=new Timer();
					
					TimerTask g�rev89=new  TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							
								btna.setBackground(Color.ORANGE);
								
								
								
							
						}
					};
					zamanlay�c�678.schedule(g�rev89, 0, 100000);
					TimerTask g�rev98 =new TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							
							btna.setBackground(Color.RED);
							
							
							JOptionPane.showMessageDialog(null, " 2. Baraj� ge�ti�iniz i�in �d�l�n�z 15000 TL. Do�ru ��k : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
							
							btn15000.setBackground(Color.GREEN);
						}
					}; zamanlay�c�678.schedule(g�rev98, 5000, 10000);
					
					btna.setBackground(Color.RED);
				
			break;
         case "B) �sko�ya":
        	 btnbasla.setVisible(false);
        	 btna.setVisible(false);
			  btnc.setVisible(false);
			  btnd.setVisible(false);
			  btnyuzde.setVisible(false);
			  btncekil.setVisible(false);
        	 REnkler();
         	 
         	 Timer zamanlay�c�2=new Timer();
  			
  			TimerTask g�rev3=new  TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  				
  						btnb.setBackground(Color.ORANGE);
  						
  						
  						
  					
  				}
  			};
  			zamanlay�c�2.schedule(g�rev3, 0, 100000);
  			Timer zamanlay�c�3=new Timer();
  			TimerTask g�rev4= new TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					//btn500.setBackground(Color.GREEN);
  				
  					
  					btnb.setBackground(Color.GREEN);
  					
  					
  					
  					
  					
  				}
  			}; zamanlay�c�3.schedule(g�rev4, 1200,250);
  			
  			
  			Timer zamanlay�c�4=new Timer();
  			TimerTask g�rev5=new TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					btnb.setBackground(Color.BLACK);

                             sayi++;
  					if(sayi==8){
  						zamanlay�c�4.cancel();
  					}
  				}
  			}; zamanlay�c�4.schedule(g�rev5,1400,250);
  			Timer zaman5=new Timer();
  			TimerTask g�rev�d�l=new TimerTask() {
  				
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
					btn250.setBackground(Color.GREEN);
  					
					
					btns�radaki.setVisible(true);
  				}
  			};zaman5.schedule(g�rev�d�l, 1200, 1);
        	 
        	 
        	 
			break;
        case "C) �ngiltere":
        	btnbasla.setVisible(false);
        	 btnb.setVisible(false);
			  btna.setVisible(false);
			  btnd.setVisible(false);
			  btnyuzde.setVisible(false);
			  btncekil.setVisible(false);
        	REnkler();
         	  Timer zamanlay�c�333=new Timer();
   			
   			TimerTask g�revax=new  TimerTask() {
   				
   				@Override
   				public void run() {
   					// TODO Auto-generated method stub
   					
   						btnc.setBackground(Color.ORANGE);
   						
   						
   						
   					
   				}
   			};
   			zamanlay�c�333.schedule(g�revax, 0, 100000);
   			TimerTask g�rev91 =new TimerTask() {
   				
   				@Override
   				public void run() {
   					// TODO Auto-generated method stub
   					
   					btnc.setBackground(Color.RED);
   					
   					
   					JOptionPane.showMessageDialog(null, " 2. Baraj� ge�ti�iniz i�in �d�l�n�z 15000 TL. Do�ru ��k : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
   					btn15000.setBackground(Color.GREEN);
   					
   				}
   			}; zamanlay�c�333.schedule(g�rev91, 5000, 10000);
   			
   			btnc.setBackground(Color.RED);
   			
           	
	break;
        case "D) L�ksemburg":
        	btnbasla.setVisible(false);
        	 btnb.setVisible(false);
			  btnc.setVisible(false);
			  btna.setVisible(false);
			  btnyuzde.setVisible(false);
			  btncekil.setVisible(false);
        	REnkler();
        	 
        	 Timer zamanlay�c�6=new Timer();
  			
  			TimerTask g�rev8=new  TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  						btnd.setBackground(Color.ORANGE);
  						
  						
  						
  					
  				}
  			};
  			zamanlay�c�6.schedule(g�rev8, 0, 100000);
  			TimerTask g�rev9 =new TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  					btnd.setBackground(Color.RED);
  					
  					
  					JOptionPane.showMessageDialog(null, " 2. Baraj� ge�ti�iniz i�in �d�l�n�z 15000 TL. Do�ru ��k : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
  					btn15000.setBackground(Color.GREEN);
  					
  				}
  			}; zamanlay�c�6.schedule(g�rev9, 5000, 10000);
  			
  			btnd.setBackground(Color.RED);
  			
         	 
         	 
        	
	break;
       case "Milyonluk Soru":
	
	  Soru12 soru12=new Soru12();
	  soru12.setVisible(true);
    	   
    	   
	break;
	default :
		break;
		}
	
	}
	
	
	
	
	
public  void REnkler(){
		
		
		Timer zamanlay�c�x=new Timer();
	TimerTask g�rev0=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn0tl.setBackground(Color.ORANGE);
				
				
			}
		};zamanlay�c�x.schedule(g�rev0, 90, 10000);
		TimerTask g�revx=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn500.setBackground(Color.ORANGE);
				
				
			}
		};zamanlay�c�x.schedule(g�revx, 120, 100000);
		
		TimerTask g�revy=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn1000.setBackground(Color.ORANGE);
			}
		}; zamanlay�c�x.schedule(g�revy, 150, 10000);
		TimerTask g�revz=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn2000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revz, 180, 10000);
		TimerTask g�reva=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn3000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�reva, 210, 10000);
	      TimerTask g�revb=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn5000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revb, 240, 10000);
		
	TimerTask g�revc=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn7500.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revc, 270, 10000);
		
	TimerTask g�revd=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn15000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revd, 300, 10000);
		
	TimerTask g�reve=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnotuz.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�reve, 330, 10000);
	TimerTask g�revf=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn60.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revf, 360, 10000);
	TimerTask g�revg=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn125.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revg, 390, 10000);
	TimerTask g�revh=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn250.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revh,420, 10000);
	TimerTask g�revj=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnmilyon.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revj, 450, 10000);
	}
}
