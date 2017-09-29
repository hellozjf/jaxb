//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:50 PM CST 
//


package com.hellozjf.test.jaxb.TransAppVouch;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hellozjf.test.jaxb.TransAppVouch package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hellozjf.test.jaxb.TransAppVouch
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
     * Create an instance of {@link Ufinterface.Storeinout }
     * 
     */
    public Ufinterface.Storeinout createUfinterfaceStoreinout() {
        return new Ufinterface.Storeinout();
    }

    /**
     * Create an instance of {@link Ufinterface.Storeinout.Body }
     * 
     */
    public Ufinterface.Storeinout.Body createUfinterfaceStoreinoutBody() {
        return new Ufinterface.Storeinout.Body();
    }

    /**
     * Create an instance of {@link NewDataSet }
     * 
     */
    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    /**
     * Create an instance of {@link Ufinterface.Storeinout.Header }
     * 
     */
    public Ufinterface.Storeinout.Header createUfinterfaceStoreinoutHeader() {
        return new Ufinterface.Storeinout.Header();
    }

    /**
     * Create an instance of {@link Ufinterface.Storeinout.Body.Entry }
     * 
     */
    public Ufinterface.Storeinout.Body.Entry createUfinterfaceStoreinoutBodyEntry() {
        return new Ufinterface.Storeinout.Body.Entry();
    }

}
