package MyMath;

import java.awt.Color;
import javax.swing.JFrame;
import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.plots.lines.LineRenderer;
import de.erichseifert.gral.plots.points.PointRenderer;
import de.erichseifert.gral.ui.InteractivePanel;

/**
 * 
 * @author Nour Ilya
 *
 */
public class Gral extends JFrame {

	public Gral(Polynom_able p, double x0, double x1) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);

		DataTable data = new DataTable(Double.class, Double.class);
			double eps = 0.01;
		for (double x = x0; x <= x1; x+=eps) {
			
			double y = p.f(x);
			
			if(p.f(x-eps) < p.f(x) && p.f(x) > p.f(x+eps))
				
				System.out.println("("+x+","+(p.f(x))+") MAX");

			if(p.f(x-eps) > p.f(x) && p.f(x) < p.f(x+eps))
				
				System.out.println("("+x+","+p.f(x)+") MIN");

			data.add(x, y);	
		}
		
		XYPlot plot = new XYPlot(data);
		
		getContentPane().add(new InteractivePanel(plot));
		
		LineRenderer lines = new DefaultLineRenderer2D();
		
		plot.setLineRenderers(data, lines);
		
		Color color = new Color(0.0f, 0.3f, 1.0f);
		
		plot.getPointRenderers(data).get(0).setColor(color);
		
		plot.getLineRenderers(data).get(0).setColor(color);
	}
}