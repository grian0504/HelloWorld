/*  首先是登入介面 */

package test;
/*awt*/

import java.awt.Demension;      //封裝了一個構建的高度和寬度
import java.awt.FlowLayout;     //流式佈局，解決元件相互覆蓋問題
import java.awt.Font;           //字型

/*swing*/

import javax.swing.JFrame;          //窗體容器元件類(屬於頂級容器)
import javax.swing.JLabel;          //標籤
import javax.swing.JTextFiled;      //文件輸入框元件類
import javax.swing.JPasswordFiled;  //密碼輸入框元件類
import javax.swing.JButton;         //按鍵元件類

/**
 * Login
 */
public class Login {

    //**在類中定義主涵式**/
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        //在主涵式中，例項化Login類的物件，呼叫初始化界面的方法
        Login login = new Login();
        login.initUI();
    }
    //在類中定義初始化介面的方法
    public void initUI() {
        //在initUI中例項化JFrame類的物件
        JFrame frame = new JFrame();
        //設定窗體物件的屬性值
        frame.setTitle("Login");          //設定窗體標題
        frame.setSize(400, 250);          //設定窗體大小，只對頂層容器生效
        frame.setDefaultCloseOperation(3);//設定窗體關閉操作，3表示關閉窗體退出程式
        frame.setLocationRelativeTo(null);//設定窗體相對於另一組間的居中位置，引數null表示窗體相對於螢幕的中央位置
        frame.setResizable(false);//禁止調整窗體大小
        frame.setFont(new Font("宋體",font.PLAIN,14));//設定字型，顯示格式正常，大小

        //例項化FlowLayout流式佈局類的物件，指定對齊方式為居中對齊元件之間的間隔為10個畫素
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,10,10);
        //例項化流式佈局類的物件
        frame.setLayout(f1);

        //例項化JLabel標籤物件，該物件顯示"帳號"
        JLabel labname = new JLabel("帳號:");
        labname.setFout(new Font("宋體",Font.PLAIN,14));
        //將Labname標籤新增到窗體上
        frame.add(labname);

        //例項化JTextFiled標籤物件化
        JTextField text_name = new JTextFueld();
        Dimension dim1 = new Dimension(300,30);
        text_name.setPreferredSize(dim1);//設定除頂級容器元件 
        //將textName標籤新增到窗體上
        frame.add(text_name);
        
        //例項化JLabel標籤物件，該物件顯示"密碼"
        JLabel labpass = new JLabel("密碼:");
        labpass.setFont(new Font("宋體",Font.PLAIN,14));
        //將Labpass新增到窗體上
        frame.add(labpass);

        //例項化JPasswordField
        JPasswordField text_password = new JPasswordField();
        //設定大小
        text_password.setpreferredSize(dim1);
        //新增到窗體
        frame.add(text_password);

        //例項化JButton元件
        JButton button1 = new JButten();
        //設定按鍵的顯示內容
        Dimension dim2 = new Dimension(100,30);
        button1.setText("登入");
        button1.setFont(new Font("宋體",Font.PLAIN,14));
        //設定按鍵大小
        button1.setSize(dim2);
        frame.add(butten1);

        frame.setVisible(true);//窗體可見，一定要放在所有元件加入窗體後

        LoginListener 11 =new LoginListenter(frame,text_name,text_passworld);
        button1.addActionListener(11);




    }