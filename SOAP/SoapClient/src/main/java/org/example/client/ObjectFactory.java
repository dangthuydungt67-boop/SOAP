
package org.example.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GuiThongTin_QNAME = new QName("http://example.org/", "guiThongTin");
    private final static QName _GuiThongTinResponse_QNAME = new QName("http://example.org/", "guiThongTinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GuiThongTin }
     * 
     */
    public GuiThongTin createGuiThongTin() {
        return new GuiThongTin();
    }

    /**
     * Create an instance of {@link GuiThongTinResponse }
     * 
     */
    public GuiThongTinResponse createGuiThongTinResponse() {
        return new GuiThongTinResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuiThongTin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuiThongTin }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "guiThongTin")
    public JAXBElement<GuiThongTin> createGuiThongTin(GuiThongTin value) {
        return new JAXBElement<GuiThongTin>(_GuiThongTin_QNAME, GuiThongTin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuiThongTinResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuiThongTinResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "guiThongTinResponse")
    public JAXBElement<GuiThongTinResponse> createGuiThongTinResponse(GuiThongTinResponse value) {
        return new JAXBElement<GuiThongTinResponse>(_GuiThongTinResponse_QNAME, GuiThongTinResponse.class, null, value);
    }

}
