//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:23 PM CST 
//


package com.hellozjf.test.jaxb.ItemCost;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hellozjf.test.jaxb.ItemCost package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hellozjf.test.jaxb.ItemCost
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
     * Create an instance of {@link Ufinterface.Itemcost }
     * 
     */
    public Ufinterface.Itemcost createUfinterfaceItemcost() {
        return new Ufinterface.Itemcost();
    }

    /**
     * Create an instance of {@link Ufinterface.Itemcost.Detail }
     * 
     */
    public Ufinterface.Itemcost.Detail createUfinterfaceItemcostDetail() {
        return new Ufinterface.Itemcost.Detail();
    }

    /**
     * Create an instance of {@link Ufinterface.Itemcost.Detail.CostDetailStatement }
     * 
     */
    public Ufinterface.Itemcost.Detail.CostDetailStatement createUfinterfaceItemcostDetailCostDetailStatement() {
        return new Ufinterface.Itemcost.Detail.CostDetailStatement();
    }

    /**
     * Create an instance of {@link NewDataSet }
     * 
     */
    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    /**
     * Create an instance of {@link Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail }
     * 
     */
    public Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail createUfinterfaceItemcostDetailCostDetailStatementCostDetail() {
        return new Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail();
    }

}
