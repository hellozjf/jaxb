//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:06 PM CST 
//


package com.hellozjf.test.jaxb.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="abbrname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sort_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="domain_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tax_reg_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bank_open" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bank_acc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seed_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="legal_man" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="devliver_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deliver_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deli_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ar_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_rec_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_rec_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pricegrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InvoiceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreditByHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreditDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Proxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bLimitSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusPortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cPrimaryVen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fCommisionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fInsueRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bCusState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cRelVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bshop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Crm_Contact_cMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Crm_Contact_cOfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bcusdomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bcusoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccuscreditcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccussaprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusexprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fcusdiscountrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccussscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccuscmprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dcuscreatedatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusMnemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fAdvancePaymentRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bServiceAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bOnGPinStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bRequestSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="roottag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="docid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receiver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeexchanged" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportneedexch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customer"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Customer> customer;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "docid")
    protected String docid;
    @XmlAttribute(name = "receiver")
    protected String receiver;
    @XmlAttribute(name = "sender")
    protected String sender;
    @XmlAttribute(name = "proc")
    protected String proc;
    @XmlAttribute(name = "codeexchanged")
    protected String codeexchanged;
    @XmlAttribute(name = "exportneedexch")
    protected String exportneedexch;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Customer }
     * 
     * 
     */
    public List<Ufinterface.Customer> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<Ufinterface.Customer>();
        }
        return this.customer;
    }

    /**
     * ��ȡroottag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoottag() {
        return roottag;
    }

    /**
     * ����roottag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoottag(String value) {
        this.roottag = value;
    }

    /**
     * ��ȡbilltype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * ����billtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltype(String value) {
        this.billtype = value;
    }

    /**
     * ��ȡdocid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocid() {
        return docid;
    }

    /**
     * ����docid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocid(String value) {
        this.docid = value;
    }

    /**
     * ��ȡreceiver���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * ����receiver���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * ��ȡsender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * ����sender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * ��ȡproc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProc() {
        return proc;
    }

    /**
     * ����proc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProc(String value) {
        this.proc = value;
    }

    /**
     * ��ȡcodeexchanged���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeexchanged() {
        return codeexchanged;
    }

    /**
     * ����codeexchanged���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeexchanged(String value) {
        this.codeexchanged = value;
    }

    /**
     * ��ȡexportneedexch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportneedexch() {
        return exportneedexch;
    }

    /**
     * ����exportneedexch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportneedexch(String value) {
        this.exportneedexch = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="abbrname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sort_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="domain_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tax_reg_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bank_open" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bank_acc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seed_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="legal_man" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="devliver_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deliver_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deli_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ar_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_rec_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_rec_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pricegrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InvoiceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreditByHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreditDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Proxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bLimitSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusPortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cPrimaryVen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fCommisionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fInsueRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bCusState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cRelVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bshop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Crm_Contact_cMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Crm_Contact_cOfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bcusdomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bcusoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccuscreditcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccussaprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusexprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fcusdiscountrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccussscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccuscmprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dcuscreatedatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusMnemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fAdvancePaymentRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bServiceAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bOnGPinStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bRequestSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name",
        "abbrname",
        "sortCode",
        "domainCode",
        "industry",
        "address",
        "postcode",
        "taxRegCode",
        "bankOpen",
        "bankAccNumber",
        "seedDate",
        "legalMan",
        "email",
        "contact",
        "phone",
        "fax",
        "bp",
        "mobile",
        "specOperator",
        "discountRate",
        "creditRank",
        "creditAmount",
        "creditDeadline",
        "payCondition",
        "devliverSite",
        "deliverMode",
        "headCorpCode",
        "deliWarehouse",
        "superDept",
        "arRest",
        "lastTrDate",
        "lastTrAmount",
        "lastRecDate",
        "lastRecAmount",
        "endDate",
        "trFrequency",
        "selfDefine1",
        "selfDefine2",
        "selfDefine3",
        "pricegrade",
        "createPerson",
        "modifyPerson",
        "modifyDate",
        "authClass",
        "selfDefine4",
        "selfDefine5",
        "selfDefine6",
        "selfDefine7",
        "selfDefine8",
        "selfDefine9",
        "selfDefine10",
        "selfDefine11",
        "selfDefine12",
        "selfDefine13",
        "selfDefine14",
        "selfDefine15",
        "selfDefine16",
        "invoiceCompany",
        "credit",
        "creditByHead",
        "creditDate",
        "licenceDate",
        "licenceSDate",
        "licenceEDate",
        "licenceADays",
        "businessDate",
        "businessSDate",
        "businessEDate",
        "businessADays",
        "proxy",
        "proxySDate",
        "proxyEDate",
        "proxyADays",
        "memo",
        "bLimitSale",
        "cCusCountryCode",
        "cCusEnName",
        "cCusEnAddr1",
        "cCusEnAddr2",
        "cCusEnAddr3",
        "cCusEnAddr4",
        "cCusPortCode",
        "cPrimaryVen",
        "fCommisionRate",
        "fInsueRate",
        "bHomeBranch",
        "cBranchAddr",
        "cBranchPhone",
        "cBranchPerson",
        "cCusTradeCCode",
        "customerKCode",
        "bCusState",
        "ccusbankcode",
        "cRelVendor",
        "ccusexchName",
        "bshop",
        "crmContactCMobilePhone",
        "crmContactCOfficePhone",
        "bcusdomestic",
        "bcusoverseas",
        "ccuscreditcompany",
        "ccussaprotocol",
        "ccusexprotocol",
        "ccusotherprotocol",
        "fcusdiscountrate",
        "ccussscode",
        "ccuscmprotocol",
        "dcuscreatedatetime",
        "cCusMnemCode",
        "fAdvancePaymentRatio",
        "bServiceAttribute",
        "bOnGPinStore",
        "bRequestSign"
    })
    public static class Customer {

        protected String code;
        protected String name;
        protected String abbrname;
        @XmlElement(name = "sort_code")
        protected String sortCode;
        @XmlElement(name = "domain_code")
        protected String domainCode;
        protected String industry;
        protected String address;
        protected String postcode;
        @XmlElement(name = "tax_reg_code")
        protected String taxRegCode;
        @XmlElement(name = "bank_open")
        protected String bankOpen;
        @XmlElement(name = "bank_acc_number")
        protected String bankAccNumber;
        @XmlElement(name = "seed_date")
        protected String seedDate;
        @XmlElement(name = "legal_man")
        protected String legalMan;
        protected String email;
        protected String contact;
        protected String phone;
        protected String fax;
        protected String bp;
        protected String mobile;
        @XmlElement(name = "spec_operator")
        protected String specOperator;
        @XmlElement(name = "discount_rate")
        protected String discountRate;
        @XmlElement(name = "credit_rank")
        protected String creditRank;
        @XmlElement(name = "credit_amount")
        protected String creditAmount;
        @XmlElement(name = "credit_deadline")
        protected String creditDeadline;
        @XmlElement(name = "pay_condition")
        protected String payCondition;
        @XmlElement(name = "devliver_site")
        protected String devliverSite;
        @XmlElement(name = "deliver_mode")
        protected String deliverMode;
        @XmlElement(name = "head_corp_code")
        protected String headCorpCode;
        @XmlElement(name = "deli_warehouse")
        protected String deliWarehouse;
        @XmlElement(name = "super_dept")
        protected String superDept;
        @XmlElement(name = "ar_rest")
        protected String arRest;
        @XmlElement(name = "last_tr_date")
        protected String lastTrDate;
        @XmlElement(name = "last_tr_amount")
        protected String lastTrAmount;
        @XmlElement(name = "last_rec_date")
        protected String lastRecDate;
        @XmlElement(name = "last_rec_amount")
        protected String lastRecAmount;
        @XmlElement(name = "end_date")
        protected String endDate;
        @XmlElement(name = "tr_frequency")
        protected String trFrequency;
        @XmlElement(name = "self_define1")
        protected String selfDefine1;
        @XmlElement(name = "self_define2")
        protected String selfDefine2;
        @XmlElement(name = "self_define3")
        protected String selfDefine3;
        protected String pricegrade;
        @XmlElement(name = "CreatePerson")
        protected String createPerson;
        @XmlElement(name = "ModifyPerson")
        protected String modifyPerson;
        @XmlElement(name = "ModifyDate")
        protected String modifyDate;
        @XmlElement(name = "auth_class")
        protected String authClass;
        @XmlElement(name = "self_define4")
        protected String selfDefine4;
        @XmlElement(name = "self_define5")
        protected String selfDefine5;
        @XmlElement(name = "self_define6")
        protected String selfDefine6;
        @XmlElement(name = "self_define7")
        protected String selfDefine7;
        @XmlElement(name = "self_define8")
        protected String selfDefine8;
        @XmlElement(name = "self_define9")
        protected String selfDefine9;
        @XmlElement(name = "self_define10")
        protected String selfDefine10;
        @XmlElement(name = "self_define11")
        protected String selfDefine11;
        @XmlElement(name = "self_define12")
        protected String selfDefine12;
        @XmlElement(name = "self_define13")
        protected String selfDefine13;
        @XmlElement(name = "self_define14")
        protected String selfDefine14;
        @XmlElement(name = "self_define15")
        protected String selfDefine15;
        @XmlElement(name = "self_define16")
        protected String selfDefine16;
        @XmlElement(name = "InvoiceCompany")
        protected String invoiceCompany;
        @XmlElement(name = "Credit")
        protected String credit;
        @XmlElement(name = "CreditByHead")
        protected String creditByHead;
        @XmlElement(name = "CreditDate")
        protected String creditDate;
        @XmlElement(name = "LicenceDate")
        protected String licenceDate;
        @XmlElement(name = "LicenceSDate")
        protected String licenceSDate;
        @XmlElement(name = "LicenceEDate")
        protected String licenceEDate;
        @XmlElement(name = "LicenceADays")
        protected String licenceADays;
        @XmlElement(name = "BusinessDate")
        protected String businessDate;
        @XmlElement(name = "BusinessSDate")
        protected String businessSDate;
        @XmlElement(name = "BusinessEDate")
        protected String businessEDate;
        @XmlElement(name = "BusinessADays")
        protected String businessADays;
        @XmlElement(name = "Proxy")
        protected String proxy;
        @XmlElement(name = "ProxySDate")
        protected String proxySDate;
        @XmlElement(name = "ProxyEDate")
        protected String proxyEDate;
        @XmlElement(name = "ProxyADays")
        protected String proxyADays;
        @XmlElement(name = "Memo")
        protected String memo;
        protected String bLimitSale;
        protected String cCusCountryCode;
        protected String cCusEnName;
        protected String cCusEnAddr1;
        protected String cCusEnAddr2;
        protected String cCusEnAddr3;
        protected String cCusEnAddr4;
        protected String cCusPortCode;
        protected String cPrimaryVen;
        protected String fCommisionRate;
        protected String fInsueRate;
        protected String bHomeBranch;
        protected String cBranchAddr;
        protected String cBranchPhone;
        protected String cBranchPerson;
        protected String cCusTradeCCode;
        @XmlElement(name = "CustomerKCode")
        protected String customerKCode;
        protected String bCusState;
        protected String ccusbankcode;
        protected String cRelVendor;
        @XmlElement(name = "ccusexch_name")
        protected String ccusexchName;
        protected String bshop;
        @XmlElement(name = "Crm_Contact_cMobilePhone")
        protected String crmContactCMobilePhone;
        @XmlElement(name = "Crm_Contact_cOfficePhone")
        protected String crmContactCOfficePhone;
        protected String bcusdomestic;
        protected String bcusoverseas;
        protected String ccuscreditcompany;
        protected String ccussaprotocol;
        protected String ccusexprotocol;
        protected String ccusotherprotocol;
        protected String fcusdiscountrate;
        protected String ccussscode;
        protected String ccuscmprotocol;
        protected String dcuscreatedatetime;
        protected String cCusMnemCode;
        protected String fAdvancePaymentRatio;
        protected String bServiceAttribute;
        protected String bOnGPinStore;
        protected String bRequestSign;

        /**
         * ��ȡcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡabbrname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbbrname() {
            return abbrname;
        }

        /**
         * ����abbrname���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbbrname(String value) {
            this.abbrname = value;
        }

        /**
         * ��ȡsortCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortCode() {
            return sortCode;
        }

        /**
         * ����sortCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSortCode(String value) {
            this.sortCode = value;
        }

        /**
         * ��ȡdomainCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainCode() {
            return domainCode;
        }

        /**
         * ����domainCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainCode(String value) {
            this.domainCode = value;
        }

        /**
         * ��ȡindustry���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndustry() {
            return industry;
        }

        /**
         * ����industry���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndustry(String value) {
            this.industry = value;
        }

        /**
         * ��ȡaddress���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * ����address���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * ��ȡpostcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcode() {
            return postcode;
        }

        /**
         * ����postcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcode(String value) {
            this.postcode = value;
        }

        /**
         * ��ȡtaxRegCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxRegCode() {
            return taxRegCode;
        }

        /**
         * ����taxRegCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxRegCode(String value) {
            this.taxRegCode = value;
        }

        /**
         * ��ȡbankOpen���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankOpen() {
            return bankOpen;
        }

        /**
         * ����bankOpen���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankOpen(String value) {
            this.bankOpen = value;
        }

        /**
         * ��ȡbankAccNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankAccNumber() {
            return bankAccNumber;
        }

        /**
         * ����bankAccNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankAccNumber(String value) {
            this.bankAccNumber = value;
        }

        /**
         * ��ȡseedDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeedDate() {
            return seedDate;
        }

        /**
         * ����seedDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeedDate(String value) {
            this.seedDate = value;
        }

        /**
         * ��ȡlegalMan���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalMan() {
            return legalMan;
        }

        /**
         * ����legalMan���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalMan(String value) {
            this.legalMan = value;
        }

        /**
         * ��ȡemail���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * ����email���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * ��ȡcontact���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * ����contact���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * ��ȡphone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * ����phone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * ��ȡfax���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * ����fax���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * ��ȡbp���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBp() {
            return bp;
        }

        /**
         * ����bp���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBp(String value) {
            this.bp = value;
        }

        /**
         * ��ȡmobile���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobile() {
            return mobile;
        }

        /**
         * ����mobile���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobile(String value) {
            this.mobile = value;
        }

        /**
         * ��ȡspecOperator���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecOperator() {
            return specOperator;
        }

        /**
         * ����specOperator���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecOperator(String value) {
            this.specOperator = value;
        }

        /**
         * ��ȡdiscountRate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountRate() {
            return discountRate;
        }

        /**
         * ����discountRate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountRate(String value) {
            this.discountRate = value;
        }

        /**
         * ��ȡcreditRank���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditRank() {
            return creditRank;
        }

        /**
         * ����creditRank���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditRank(String value) {
            this.creditRank = value;
        }

        /**
         * ��ȡcreditAmount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditAmount() {
            return creditAmount;
        }

        /**
         * ����creditAmount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditAmount(String value) {
            this.creditAmount = value;
        }

        /**
         * ��ȡcreditDeadline���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditDeadline() {
            return creditDeadline;
        }

        /**
         * ����creditDeadline���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditDeadline(String value) {
            this.creditDeadline = value;
        }

        /**
         * ��ȡpayCondition���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayCondition() {
            return payCondition;
        }

        /**
         * ����payCondition���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayCondition(String value) {
            this.payCondition = value;
        }

        /**
         * ��ȡdevliverSite���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDevliverSite() {
            return devliverSite;
        }

        /**
         * ����devliverSite���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDevliverSite(String value) {
            this.devliverSite = value;
        }

        /**
         * ��ȡdeliverMode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliverMode() {
            return deliverMode;
        }

        /**
         * ����deliverMode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliverMode(String value) {
            this.deliverMode = value;
        }

        /**
         * ��ȡheadCorpCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadCorpCode() {
            return headCorpCode;
        }

        /**
         * ����headCorpCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadCorpCode(String value) {
            this.headCorpCode = value;
        }

        /**
         * ��ȡdeliWarehouse���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliWarehouse() {
            return deliWarehouse;
        }

        /**
         * ����deliWarehouse���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliWarehouse(String value) {
            this.deliWarehouse = value;
        }

        /**
         * ��ȡsuperDept���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperDept() {
            return superDept;
        }

        /**
         * ����superDept���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperDept(String value) {
            this.superDept = value;
        }

        /**
         * ��ȡarRest���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArRest() {
            return arRest;
        }

        /**
         * ����arRest���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArRest(String value) {
            this.arRest = value;
        }

        /**
         * ��ȡlastTrDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastTrDate() {
            return lastTrDate;
        }

        /**
         * ����lastTrDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTrDate(String value) {
            this.lastTrDate = value;
        }

        /**
         * ��ȡlastTrAmount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastTrAmount() {
            return lastTrAmount;
        }

        /**
         * ����lastTrAmount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTrAmount(String value) {
            this.lastTrAmount = value;
        }

        /**
         * ��ȡlastRecDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRecDate() {
            return lastRecDate;
        }

        /**
         * ����lastRecDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRecDate(String value) {
            this.lastRecDate = value;
        }

        /**
         * ��ȡlastRecAmount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRecAmount() {
            return lastRecAmount;
        }

        /**
         * ����lastRecAmount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRecAmount(String value) {
            this.lastRecAmount = value;
        }

        /**
         * ��ȡendDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * ����endDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * ��ȡtrFrequency���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrFrequency() {
            return trFrequency;
        }

        /**
         * ����trFrequency���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrFrequency(String value) {
            this.trFrequency = value;
        }

        /**
         * ��ȡselfDefine1���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine1() {
            return selfDefine1;
        }

        /**
         * ����selfDefine1���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine1(String value) {
            this.selfDefine1 = value;
        }

        /**
         * ��ȡselfDefine2���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine2() {
            return selfDefine2;
        }

        /**
         * ����selfDefine2���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine2(String value) {
            this.selfDefine2 = value;
        }

        /**
         * ��ȡselfDefine3���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine3() {
            return selfDefine3;
        }

        /**
         * ����selfDefine3���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine3(String value) {
            this.selfDefine3 = value;
        }

        /**
         * ��ȡpricegrade���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricegrade() {
            return pricegrade;
        }

        /**
         * ����pricegrade���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricegrade(String value) {
            this.pricegrade = value;
        }

        /**
         * ��ȡcreatePerson���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatePerson() {
            return createPerson;
        }

        /**
         * ����createPerson���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatePerson(String value) {
            this.createPerson = value;
        }

        /**
         * ��ȡmodifyPerson���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifyPerson() {
            return modifyPerson;
        }

        /**
         * ����modifyPerson���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifyPerson(String value) {
            this.modifyPerson = value;
        }

        /**
         * ��ȡmodifyDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifyDate() {
            return modifyDate;
        }

        /**
         * ����modifyDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifyDate(String value) {
            this.modifyDate = value;
        }

        /**
         * ��ȡauthClass���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthClass() {
            return authClass;
        }

        /**
         * ����authClass���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthClass(String value) {
            this.authClass = value;
        }

        /**
         * ��ȡselfDefine4���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine4() {
            return selfDefine4;
        }

        /**
         * ����selfDefine4���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine4(String value) {
            this.selfDefine4 = value;
        }

        /**
         * ��ȡselfDefine5���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine5() {
            return selfDefine5;
        }

        /**
         * ����selfDefine5���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine5(String value) {
            this.selfDefine5 = value;
        }

        /**
         * ��ȡselfDefine6���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine6() {
            return selfDefine6;
        }

        /**
         * ����selfDefine6���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine6(String value) {
            this.selfDefine6 = value;
        }

        /**
         * ��ȡselfDefine7���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine7() {
            return selfDefine7;
        }

        /**
         * ����selfDefine7���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine7(String value) {
            this.selfDefine7 = value;
        }

        /**
         * ��ȡselfDefine8���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine8() {
            return selfDefine8;
        }

        /**
         * ����selfDefine8���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine8(String value) {
            this.selfDefine8 = value;
        }

        /**
         * ��ȡselfDefine9���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine9() {
            return selfDefine9;
        }

        /**
         * ����selfDefine9���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine9(String value) {
            this.selfDefine9 = value;
        }

        /**
         * ��ȡselfDefine10���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine10() {
            return selfDefine10;
        }

        /**
         * ����selfDefine10���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine10(String value) {
            this.selfDefine10 = value;
        }

        /**
         * ��ȡselfDefine11���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine11() {
            return selfDefine11;
        }

        /**
         * ����selfDefine11���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine11(String value) {
            this.selfDefine11 = value;
        }

        /**
         * ��ȡselfDefine12���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine12() {
            return selfDefine12;
        }

        /**
         * ����selfDefine12���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine12(String value) {
            this.selfDefine12 = value;
        }

        /**
         * ��ȡselfDefine13���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine13() {
            return selfDefine13;
        }

        /**
         * ����selfDefine13���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine13(String value) {
            this.selfDefine13 = value;
        }

        /**
         * ��ȡselfDefine14���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine14() {
            return selfDefine14;
        }

        /**
         * ����selfDefine14���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine14(String value) {
            this.selfDefine14 = value;
        }

        /**
         * ��ȡselfDefine15���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine15() {
            return selfDefine15;
        }

        /**
         * ����selfDefine15���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine15(String value) {
            this.selfDefine15 = value;
        }

        /**
         * ��ȡselfDefine16���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine16() {
            return selfDefine16;
        }

        /**
         * ����selfDefine16���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine16(String value) {
            this.selfDefine16 = value;
        }

        /**
         * ��ȡinvoiceCompany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceCompany() {
            return invoiceCompany;
        }

        /**
         * ����invoiceCompany���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceCompany(String value) {
            this.invoiceCompany = value;
        }

        /**
         * ��ȡcredit���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredit() {
            return credit;
        }

        /**
         * ����credit���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredit(String value) {
            this.credit = value;
        }

        /**
         * ��ȡcreditByHead���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditByHead() {
            return creditByHead;
        }

        /**
         * ����creditByHead���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditByHead(String value) {
            this.creditByHead = value;
        }

        /**
         * ��ȡcreditDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditDate() {
            return creditDate;
        }

        /**
         * ����creditDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditDate(String value) {
            this.creditDate = value;
        }

        /**
         * ��ȡlicenceDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceDate() {
            return licenceDate;
        }

        /**
         * ����licenceDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceDate(String value) {
            this.licenceDate = value;
        }

        /**
         * ��ȡlicenceSDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceSDate() {
            return licenceSDate;
        }

        /**
         * ����licenceSDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceSDate(String value) {
            this.licenceSDate = value;
        }

        /**
         * ��ȡlicenceEDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceEDate() {
            return licenceEDate;
        }

        /**
         * ����licenceEDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceEDate(String value) {
            this.licenceEDate = value;
        }

        /**
         * ��ȡlicenceADays���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceADays() {
            return licenceADays;
        }

        /**
         * ����licenceADays���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceADays(String value) {
            this.licenceADays = value;
        }

        /**
         * ��ȡbusinessDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessDate() {
            return businessDate;
        }

        /**
         * ����businessDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessDate(String value) {
            this.businessDate = value;
        }

        /**
         * ��ȡbusinessSDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessSDate() {
            return businessSDate;
        }

        /**
         * ����businessSDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessSDate(String value) {
            this.businessSDate = value;
        }

        /**
         * ��ȡbusinessEDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessEDate() {
            return businessEDate;
        }

        /**
         * ����businessEDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessEDate(String value) {
            this.businessEDate = value;
        }

        /**
         * ��ȡbusinessADays���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessADays() {
            return businessADays;
        }

        /**
         * ����businessADays���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessADays(String value) {
            this.businessADays = value;
        }

        /**
         * ��ȡproxy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxy() {
            return proxy;
        }

        /**
         * ����proxy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxy(String value) {
            this.proxy = value;
        }

        /**
         * ��ȡproxySDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxySDate() {
            return proxySDate;
        }

        /**
         * ����proxySDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxySDate(String value) {
            this.proxySDate = value;
        }

        /**
         * ��ȡproxyEDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyEDate() {
            return proxyEDate;
        }

        /**
         * ����proxyEDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyEDate(String value) {
            this.proxyEDate = value;
        }

        /**
         * ��ȡproxyADays���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyADays() {
            return proxyADays;
        }

        /**
         * ����proxyADays���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyADays(String value) {
            this.proxyADays = value;
        }

        /**
         * ��ȡmemo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemo() {
            return memo;
        }

        /**
         * ����memo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemo(String value) {
            this.memo = value;
        }

        /**
         * ��ȡbLimitSale���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLimitSale() {
            return bLimitSale;
        }

        /**
         * ����bLimitSale���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLimitSale(String value) {
            this.bLimitSale = value;
        }

        /**
         * ��ȡcCusCountryCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusCountryCode() {
            return cCusCountryCode;
        }

        /**
         * ����cCusCountryCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusCountryCode(String value) {
            this.cCusCountryCode = value;
        }

        /**
         * ��ȡcCusEnName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnName() {
            return cCusEnName;
        }

        /**
         * ����cCusEnName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnName(String value) {
            this.cCusEnName = value;
        }

        /**
         * ��ȡcCusEnAddr1���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr1() {
            return cCusEnAddr1;
        }

        /**
         * ����cCusEnAddr1���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr1(String value) {
            this.cCusEnAddr1 = value;
        }

        /**
         * ��ȡcCusEnAddr2���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr2() {
            return cCusEnAddr2;
        }

        /**
         * ����cCusEnAddr2���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr2(String value) {
            this.cCusEnAddr2 = value;
        }

        /**
         * ��ȡcCusEnAddr3���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr3() {
            return cCusEnAddr3;
        }

        /**
         * ����cCusEnAddr3���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr3(String value) {
            this.cCusEnAddr3 = value;
        }

        /**
         * ��ȡcCusEnAddr4���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr4() {
            return cCusEnAddr4;
        }

        /**
         * ����cCusEnAddr4���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr4(String value) {
            this.cCusEnAddr4 = value;
        }

        /**
         * ��ȡcCusPortCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusPortCode() {
            return cCusPortCode;
        }

        /**
         * ����cCusPortCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusPortCode(String value) {
            this.cCusPortCode = value;
        }

        /**
         * ��ȡcPrimaryVen���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPrimaryVen() {
            return cPrimaryVen;
        }

        /**
         * ����cPrimaryVen���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPrimaryVen(String value) {
            this.cPrimaryVen = value;
        }

        /**
         * ��ȡfCommisionRate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFCommisionRate() {
            return fCommisionRate;
        }

        /**
         * ����fCommisionRate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFCommisionRate(String value) {
            this.fCommisionRate = value;
        }

        /**
         * ��ȡfInsueRate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFInsueRate() {
            return fInsueRate;
        }

        /**
         * ����fInsueRate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFInsueRate(String value) {
            this.fInsueRate = value;
        }

        /**
         * ��ȡbHomeBranch���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBHomeBranch() {
            return bHomeBranch;
        }

        /**
         * ����bHomeBranch���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBHomeBranch(String value) {
            this.bHomeBranch = value;
        }

        /**
         * ��ȡcBranchAddr���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchAddr() {
            return cBranchAddr;
        }

        /**
         * ����cBranchAddr���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchAddr(String value) {
            this.cBranchAddr = value;
        }

        /**
         * ��ȡcBranchPhone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchPhone() {
            return cBranchPhone;
        }

        /**
         * ����cBranchPhone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchPhone(String value) {
            this.cBranchPhone = value;
        }

        /**
         * ��ȡcBranchPerson���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchPerson() {
            return cBranchPerson;
        }

        /**
         * ����cBranchPerson���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchPerson(String value) {
            this.cBranchPerson = value;
        }

        /**
         * ��ȡcCusTradeCCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusTradeCCode() {
            return cCusTradeCCode;
        }

        /**
         * ����cCusTradeCCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusTradeCCode(String value) {
            this.cCusTradeCCode = value;
        }

        /**
         * ��ȡcustomerKCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerKCode() {
            return customerKCode;
        }

        /**
         * ����customerKCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerKCode(String value) {
            this.customerKCode = value;
        }

        /**
         * ��ȡbCusState���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBCusState() {
            return bCusState;
        }

        /**
         * ����bCusState���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBCusState(String value) {
            this.bCusState = value;
        }

        /**
         * ��ȡccusbankcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusbankcode() {
            return ccusbankcode;
        }

        /**
         * ����ccusbankcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusbankcode(String value) {
            this.ccusbankcode = value;
        }

        /**
         * ��ȡcRelVendor���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRelVendor() {
            return cRelVendor;
        }

        /**
         * ����cRelVendor���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRelVendor(String value) {
            this.cRelVendor = value;
        }

        /**
         * ��ȡccusexchName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusexchName() {
            return ccusexchName;
        }

        /**
         * ����ccusexchName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusexchName(String value) {
            this.ccusexchName = value;
        }

        /**
         * ��ȡbshop���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBshop() {
            return bshop;
        }

        /**
         * ����bshop���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBshop(String value) {
            this.bshop = value;
        }

        /**
         * ��ȡcrmContactCMobilePhone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrmContactCMobilePhone() {
            return crmContactCMobilePhone;
        }

        /**
         * ����crmContactCMobilePhone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrmContactCMobilePhone(String value) {
            this.crmContactCMobilePhone = value;
        }

        /**
         * ��ȡcrmContactCOfficePhone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrmContactCOfficePhone() {
            return crmContactCOfficePhone;
        }

        /**
         * ����crmContactCOfficePhone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrmContactCOfficePhone(String value) {
            this.crmContactCOfficePhone = value;
        }

        /**
         * ��ȡbcusdomestic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBcusdomestic() {
            return bcusdomestic;
        }

        /**
         * ����bcusdomestic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBcusdomestic(String value) {
            this.bcusdomestic = value;
        }

        /**
         * ��ȡbcusoverseas���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBcusoverseas() {
            return bcusoverseas;
        }

        /**
         * ����bcusoverseas���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBcusoverseas(String value) {
            this.bcusoverseas = value;
        }

        /**
         * ��ȡccuscreditcompany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcuscreditcompany() {
            return ccuscreditcompany;
        }

        /**
         * ����ccuscreditcompany���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcuscreditcompany(String value) {
            this.ccuscreditcompany = value;
        }

        /**
         * ��ȡccussaprotocol���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcussaprotocol() {
            return ccussaprotocol;
        }

        /**
         * ����ccussaprotocol���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcussaprotocol(String value) {
            this.ccussaprotocol = value;
        }

        /**
         * ��ȡccusexprotocol���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusexprotocol() {
            return ccusexprotocol;
        }

        /**
         * ����ccusexprotocol���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusexprotocol(String value) {
            this.ccusexprotocol = value;
        }

        /**
         * ��ȡccusotherprotocol���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusotherprotocol() {
            return ccusotherprotocol;
        }

        /**
         * ����ccusotherprotocol���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusotherprotocol(String value) {
            this.ccusotherprotocol = value;
        }

        /**
         * ��ȡfcusdiscountrate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcusdiscountrate() {
            return fcusdiscountrate;
        }

        /**
         * ����fcusdiscountrate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcusdiscountrate(String value) {
            this.fcusdiscountrate = value;
        }

        /**
         * ��ȡccussscode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcussscode() {
            return ccussscode;
        }

        /**
         * ����ccussscode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcussscode(String value) {
            this.ccussscode = value;
        }

        /**
         * ��ȡccuscmprotocol���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcuscmprotocol() {
            return ccuscmprotocol;
        }

        /**
         * ����ccuscmprotocol���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcuscmprotocol(String value) {
            this.ccuscmprotocol = value;
        }

        /**
         * ��ȡdcuscreatedatetime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDcuscreatedatetime() {
            return dcuscreatedatetime;
        }

        /**
         * ����dcuscreatedatetime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDcuscreatedatetime(String value) {
            this.dcuscreatedatetime = value;
        }

        /**
         * ��ȡcCusMnemCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusMnemCode() {
            return cCusMnemCode;
        }

        /**
         * ����cCusMnemCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusMnemCode(String value) {
            this.cCusMnemCode = value;
        }

        /**
         * ��ȡfAdvancePaymentRatio���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAdvancePaymentRatio() {
            return fAdvancePaymentRatio;
        }

        /**
         * ����fAdvancePaymentRatio���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAdvancePaymentRatio(String value) {
            this.fAdvancePaymentRatio = value;
        }

        /**
         * ��ȡbServiceAttribute���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBServiceAttribute() {
            return bServiceAttribute;
        }

        /**
         * ����bServiceAttribute���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBServiceAttribute(String value) {
            this.bServiceAttribute = value;
        }

        /**
         * ��ȡbOnGPinStore���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOnGPinStore() {
            return bOnGPinStore;
        }

        /**
         * ����bOnGPinStore���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOnGPinStore(String value) {
            this.bOnGPinStore = value;
        }

        /**
         * ��ȡbRequestSign���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRequestSign() {
            return bRequestSign;
        }

        /**
         * ����bRequestSign���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRequestSign(String value) {
            this.bRequestSign = value;
        }

    }

}
