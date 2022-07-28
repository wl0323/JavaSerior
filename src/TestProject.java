/**
 * @author shkstart
 * @create 2022-07-22-22:45
 */

    import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

    public class TestProject extends JFrame {
        //设置游戏界面
		/*	屏幕分辨率求法:
				int w = f.getToolkit().getScreenSize().width;//宽度
				int h = f.getToolkit().getScreenSize().height;//高度
		Toolkit.getDefaultToolkit().getScreenSize().width   与上面等同
		都是用来获取屏幕的宽高，
		this.setLocation((width - 500) / 2 , (height - 500) / 2 );
		这是使你的窗口能够居中显示，这样看起来美观。
	*/
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int[][] allChess = new int[15][15];   // 用数组来保存棋子，0表示无子，1表示黑子，2表示白子
        boolean isblack = true;   //用来表示黑子还是白子， true表示黑子   false表示白子
        boolean canPlay = true;   // 用来表示当前游戏是否结束
        String message = "黑方先行";
        String blackMessage = "无限制";
        String whiteMessage = "无限制";
        public TestProject(){
            this.setTitle("五子棋1.0");
            this.setSize(500,500);
            this.setLocation((width - 500) / 2 , (height - 500) / 2 );
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);  //设置窗口不可改变，固定窗口大小
            this.setVisible(true);
            this.repaint();  //java里repaint()是重绘component的方法；
            //它会直接调用下面的方法对界面进行重行绘画
        }

        //画棋盘界面
        public void paint(Graphics g){
            //双缓冲技术
            BufferedImage buf = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
            // 这个bufferedImage 可以在网上查找相关用法，它是对图像的一种处理。
            Graphics g1 =  buf.createGraphics();  // 创建画笔
            g1.setColor(new Color(0,169,158));
            g1.fill3DRect(43, 60, 375, 375, true);

            for (int i = 0; i <= 15; i++) {
                g1.setColor(Color.WHITE);
                g1.drawLine(43, 60+i*25, 375+43, 60+i*25);  //画棋盘横线
                g1.drawLine(43+i*25, 60, 43+i*25, 375+60);  //画棋盘竖线
            }

            g1.setFont(new Font("黑体",Font.BOLD,20));
            g1.drawString("游戏信息:"+message,50,50);

            g1.drawRect(30, 440, 180, 40);
            g1.drawRect(250, 440, 180, 40);   //画黑方时间与白方时间字符串的边框
            g1.setFont(new Font("宋体",0,12));

            g1.drawString("黑方时间: "+blackMessage,40,465);
            g1.drawString("白方时间: "+whiteMessage,260,465);

            g1.drawRect(430,66,55,20);
            g1.drawString("重新开始",432,80); //重新开始按钮

            g1.drawRect(430,106,55,20);
            g1.drawString("游戏设置",432,120); //游戏设置按钮

            g1.drawRect(430,146, 55, 20);
            g1.drawString("游戏说明", 432, 160); // 游戏说明按钮

            g1.drawRect(430, 186, 55, 20);
            g1.drawString("退出游戏", 432, 200);  // 退出游戏按钮

            g1.drawRect(430, 246, 55, 20);
            g1.drawString("悔棋", 442, 260);  // 悔棋

            g1.drawRect(430, 286, 55, 20);
            g1.drawString("认输", 442, 300);  // 认输

            g.drawImage(buf, 0, 0,this);
        }

        public static void main(String[] args) {
            new TestProject();
        }

}
