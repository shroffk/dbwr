package dbwr.widgets;

import java.io.PrintWriter;

import org.w3c.dom.Element;

import dbwr.macros.MacroProvider;
import dbwr.parser.HTMLUtil;
import dbwr.parser.XMLUtil;

public class PolygonWidget extends PolylineWidget
{
	private final String background_color;

	public PolygonWidget(final MacroProvider parent, final Element xml) throws Exception
	{
		super(parent, xml, "polygon");
	    background_color = XMLUtil.getColor(xml, "background_color").orElse("#3232FF");
	}

	@Override
	protected void fillHTML(final PrintWriter html, final int indent)
	{
        HTMLUtil.indent(html, indent+2);
        html.println("<polygon points=\"" + points +
                     "\" stroke=\"" + line_color + "\" stroke-width=\"" + line_width + "\" fill=\"" + background_color + "\"/>");
	}
}
