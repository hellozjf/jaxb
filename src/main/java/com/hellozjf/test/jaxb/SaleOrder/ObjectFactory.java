//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:43 PM CST 
//


package com.hellozjf.test.jaxb.SaleOrder;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hellozjf.test.jaxb.SaleOrder package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hellozjf.test.jaxb.SaleOrder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ufinterface }
     * 
     */
    public Ufinterface createUfinterface() {
        return new Ufinterface();
    }

    /**
     * Create an instance of {@link Ufinterface.Saleorder }
     * 
     */
    public Ufinterface.Saleorder createUfinterfaceSaleorder() {
        return new Ufinterface.Saleorder();
    }

    /**
     * Create an instance of {@link Ufinterface.Saleorder.Body }
     * 
     */
    public Ufinterface.Saleorder.Body createUfinterfaceSaleorderBody() {
        return new Ufinterface.Saleorder.Body();
    }

    /**
     * Create an instance of {@link NewDataSet }
     * 
     */
    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    /**
     * Create an instance of {@link Ufinterface.Saleorder.Header }
     * 
     */
    public Ufinterface.Saleorder.Header createUfinterfaceSaleorderHeader() {
        return new Ufinterface.Saleorder.Header();
    }

    /**
     * Create an instance of {@link Ufinterface.Saleorder.Body.Entry }
     * 
     */
    public Ufinterface.Saleorder.Body.Entry createUfinterfaceSaleorderBodyEntry() {
        return new Ufinterface.Saleorder.Body.Entry();
    }

}
