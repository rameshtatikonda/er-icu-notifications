import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

public class TradingPartnerEndPoint implements Serializable {
  private static final long serialVersionUID = -1L;

  protected static final String URI = "<hostName>";

  protected static final String ID = "<listenPort>";

  private String bindAddress = "";

  private String cookie;

  private String password;

  

  public TradingPartnerEndPoint() {
    super();

   

  /**
   * @see java.lang.Object#toString()
   */
  public String toString() {
    StringBuffer sb = new StringBuffer("");
    sb.append(" \n URL = " + address);
    sb.append(" \n EndpointId = " + endpointId);
    return sb.toString();
  }

