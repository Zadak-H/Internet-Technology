import java.awt.*;
import java.applet.*;
import java.util.*;
/*
<applet code="BorderLayoutDemo.class" width=400 height=200>
</applet>
*/
public class BorderLayoutDemo extends Applet
{
        public void init()
        {
                setLayout(new BorderLayout());
                add(new Button("This is across Top."),BorderLayout.NORTH);
                add(new Label("The footer"),BorderLayout.SOUTH);
                add(new Button("Right"),BorderLayout.EAST);
                add(new Button("LEFT"),BorderLayout.WEST);

                String msg="The reasonable man adapts himself to the world;\n";
                add(new TextArea(msg),BorderLayout.CENTER);
         }
}
