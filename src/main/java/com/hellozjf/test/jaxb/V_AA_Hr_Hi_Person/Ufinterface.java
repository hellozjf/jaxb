//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:58 PM CST 
//


package com.hellozjf.test.jaxb.V_AA_Hr_Hi_Person;

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
 *         &lt;element name="v_aa_hr_hi_person" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cPsn_NameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnproperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rsex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rEmployState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rpersontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmploymentForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdutyclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobgradecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobrankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bpsnperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdept_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dbirthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnfphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnophone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsninphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnfaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnpostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnpostaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnqqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnoseat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpersonprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fcreditquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="icredate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccregrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dpvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dpinvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rNativePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rNational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rhealthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rMarriStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rPerResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vAliaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dJoinworkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dEnterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dRegularDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vSSNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dEnterUnitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bProbation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "vAaHrHiPerson"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "v_aa_hr_hi_person")
    protected List<Ufinterface.VAaHrHiPerson> vAaHrHiPerson;
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
     * Gets the value of the vAaHrHiPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAaHrHiPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAaHrHiPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.VAaHrHiPerson }
     * 
     * 
     */
    public List<Ufinterface.VAaHrHiPerson> getVAaHrHiPerson() {
        if (vAaHrHiPerson == null) {
            vAaHrHiPerson = new ArrayList<Ufinterface.VAaHrHiPerson>();
        }
        return this.vAaHrHiPerson;
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
     *         &lt;element name="cPsn_NameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnproperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rsex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rEmployState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rpersontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmploymentForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdutyclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobgradecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobrankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bpsnperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdept_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dbirthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnfphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnophone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsninphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnfaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnpostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnpostaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnqqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnoseat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpersonprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fcreditquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="icredate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccregrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dpvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dpinvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rNativePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rNational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rhealthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rMarriStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rPerResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vAliaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dJoinworkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dEnterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dRegularDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vSSNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dEnterUnitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bProbation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "cPsnNameEN",
        "jobNumber",
        "cpsnproperty",
        "rsex",
        "rEmployState",
        "rpersontype",
        "employmentForm",
        "cdutyclass",
        "cjobcode",
        "cjobgradecode",
        "cjobrankcode",
        "ridType",
        "vidNo",
        "bpsnperson",
        "cdeptNum",
        "cpsnbankcode",
        "cpsnaccount",
        "dbirthdate",
        "cpsnmobilephone",
        "cpsnfphone",
        "cpsnophone",
        "cpsninphone",
        "cpsnemail",
        "cpsnfaddr",
        "cpsnpostcode",
        "cpsnpostaddr",
        "cpsnqqcode",
        "cpsnurl",
        "cpsnoseat",
        "cpersonprop",
        "cdepcode",
        "fcreditquantity",
        "icredate",
        "ccregrade",
        "dpvaliddate",
        "dpinvaliddate",
        "rNativePlace",
        "rNational",
        "rhealthStatus",
        "rMarriStatus",
        "mPicture",
        "rPerResidence",
        "vAliaName",
        "dJoinworkDate",
        "dEnterDate",
        "dRegularDate",
        "vssNo",
        "dEnterUnitDate",
        "bProbation"
    })
    public static class VAaHrHiPerson {

        protected String code;
        protected String name;
        @XmlElement(name = "cPsn_NameEN")
        protected String cPsnNameEN;
        @XmlElement(name = "JobNumber")
        protected String jobNumber;
        protected String cpsnproperty;
        protected String rsex;
        protected String rEmployState;
        protected String rpersontype;
        @XmlElement(name = "EmploymentForm")
        protected String employmentForm;
        protected String cdutyclass;
        protected String cjobcode;
        protected String cjobgradecode;
        protected String cjobrankcode;
        @XmlElement(name = "rIDType")
        protected String ridType;
        @XmlElement(name = "vIDNo")
        protected String vidNo;
        protected String bpsnperson;
        @XmlElement(name = "cdept_num")
        protected String cdeptNum;
        protected String cpsnbankcode;
        protected String cpsnaccount;
        protected String dbirthdate;
        protected String cpsnmobilephone;
        protected String cpsnfphone;
        protected String cpsnophone;
        protected String cpsninphone;
        protected String cpsnemail;
        protected String cpsnfaddr;
        protected String cpsnpostcode;
        protected String cpsnpostaddr;
        protected String cpsnqqcode;
        protected String cpsnurl;
        protected String cpsnoseat;
        protected String cpersonprop;
        protected String cdepcode;
        protected String fcreditquantity;
        protected String icredate;
        protected String ccregrade;
        protected String dpvaliddate;
        protected String dpinvaliddate;
        protected String rNativePlace;
        protected String rNational;
        protected String rhealthStatus;
        protected String rMarriStatus;
        @XmlElement(name = "MPicture")
        protected String mPicture;
        protected String rPerResidence;
        protected String vAliaName;
        protected String dJoinworkDate;
        protected String dEnterDate;
        protected String dRegularDate;
        @XmlElement(name = "vSSNo")
        protected String vssNo;
        protected String dEnterUnitDate;
        protected String bProbation;
        @XmlAttribute(name = "tablename")
        protected String tablename;

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
         * ��ȡcPsnNameEN���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPsnNameEN() {
            return cPsnNameEN;
        }

        /**
         * ����cPsnNameEN���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPsnNameEN(String value) {
            this.cPsnNameEN = value;
        }

        /**
         * ��ȡjobNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobNumber() {
            return jobNumber;
        }

        /**
         * ����jobNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobNumber(String value) {
            this.jobNumber = value;
        }

        /**
         * ��ȡcpsnproperty���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnproperty() {
            return cpsnproperty;
        }

        /**
         * ����cpsnproperty���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnproperty(String value) {
            this.cpsnproperty = value;
        }

        /**
         * ��ȡrsex���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRsex() {
            return rsex;
        }

        /**
         * ����rsex���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRsex(String value) {
            this.rsex = value;
        }

        /**
         * ��ȡrEmployState���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREmployState() {
            return rEmployState;
        }

        /**
         * ����rEmployState���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREmployState(String value) {
            this.rEmployState = value;
        }

        /**
         * ��ȡrpersontype���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRpersontype() {
            return rpersontype;
        }

        /**
         * ����rpersontype���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRpersontype(String value) {
            this.rpersontype = value;
        }

        /**
         * ��ȡemploymentForm���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentForm() {
            return employmentForm;
        }

        /**
         * ����employmentForm���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentForm(String value) {
            this.employmentForm = value;
        }

        /**
         * ��ȡcdutyclass���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdutyclass() {
            return cdutyclass;
        }

        /**
         * ����cdutyclass���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdutyclass(String value) {
            this.cdutyclass = value;
        }

        /**
         * ��ȡcjobcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobcode() {
            return cjobcode;
        }

        /**
         * ����cjobcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobcode(String value) {
            this.cjobcode = value;
        }

        /**
         * ��ȡcjobgradecode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobgradecode() {
            return cjobgradecode;
        }

        /**
         * ����cjobgradecode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobgradecode(String value) {
            this.cjobgradecode = value;
        }

        /**
         * ��ȡcjobrankcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobrankcode() {
            return cjobrankcode;
        }

        /**
         * ����cjobrankcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobrankcode(String value) {
            this.cjobrankcode = value;
        }

        /**
         * ��ȡridType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRIDType() {
            return ridType;
        }

        /**
         * ����ridType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRIDType(String value) {
            this.ridType = value;
        }

        /**
         * ��ȡvidNo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVIDNo() {
            return vidNo;
        }

        /**
         * ����vidNo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVIDNo(String value) {
            this.vidNo = value;
        }

        /**
         * ��ȡbpsnperson���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBpsnperson() {
            return bpsnperson;
        }

        /**
         * ����bpsnperson���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBpsnperson(String value) {
            this.bpsnperson = value;
        }

        /**
         * ��ȡcdeptNum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdeptNum() {
            return cdeptNum;
        }

        /**
         * ����cdeptNum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdeptNum(String value) {
            this.cdeptNum = value;
        }

        /**
         * ��ȡcpsnbankcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnbankcode() {
            return cpsnbankcode;
        }

        /**
         * ����cpsnbankcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnbankcode(String value) {
            this.cpsnbankcode = value;
        }

        /**
         * ��ȡcpsnaccount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnaccount() {
            return cpsnaccount;
        }

        /**
         * ����cpsnaccount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnaccount(String value) {
            this.cpsnaccount = value;
        }

        /**
         * ��ȡdbirthdate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbirthdate() {
            return dbirthdate;
        }

        /**
         * ����dbirthdate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbirthdate(String value) {
            this.dbirthdate = value;
        }

        /**
         * ��ȡcpsnmobilephone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnmobilephone() {
            return cpsnmobilephone;
        }

        /**
         * ����cpsnmobilephone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnmobilephone(String value) {
            this.cpsnmobilephone = value;
        }

        /**
         * ��ȡcpsnfphone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnfphone() {
            return cpsnfphone;
        }

        /**
         * ����cpsnfphone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnfphone(String value) {
            this.cpsnfphone = value;
        }

        /**
         * ��ȡcpsnophone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnophone() {
            return cpsnophone;
        }

        /**
         * ����cpsnophone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnophone(String value) {
            this.cpsnophone = value;
        }

        /**
         * ��ȡcpsninphone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsninphone() {
            return cpsninphone;
        }

        /**
         * ����cpsninphone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsninphone(String value) {
            this.cpsninphone = value;
        }

        /**
         * ��ȡcpsnemail���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnemail() {
            return cpsnemail;
        }

        /**
         * ����cpsnemail���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnemail(String value) {
            this.cpsnemail = value;
        }

        /**
         * ��ȡcpsnfaddr���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnfaddr() {
            return cpsnfaddr;
        }

        /**
         * ����cpsnfaddr���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnfaddr(String value) {
            this.cpsnfaddr = value;
        }

        /**
         * ��ȡcpsnpostcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnpostcode() {
            return cpsnpostcode;
        }

        /**
         * ����cpsnpostcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnpostcode(String value) {
            this.cpsnpostcode = value;
        }

        /**
         * ��ȡcpsnpostaddr���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnpostaddr() {
            return cpsnpostaddr;
        }

        /**
         * ����cpsnpostaddr���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnpostaddr(String value) {
            this.cpsnpostaddr = value;
        }

        /**
         * ��ȡcpsnqqcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnqqcode() {
            return cpsnqqcode;
        }

        /**
         * ����cpsnqqcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnqqcode(String value) {
            this.cpsnqqcode = value;
        }

        /**
         * ��ȡcpsnurl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnurl() {
            return cpsnurl;
        }

        /**
         * ����cpsnurl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnurl(String value) {
            this.cpsnurl = value;
        }

        /**
         * ��ȡcpsnoseat���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnoseat() {
            return cpsnoseat;
        }

        /**
         * ����cpsnoseat���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnoseat(String value) {
            this.cpsnoseat = value;
        }

        /**
         * ��ȡcpersonprop���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpersonprop() {
            return cpersonprop;
        }

        /**
         * ����cpersonprop���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpersonprop(String value) {
            this.cpersonprop = value;
        }

        /**
         * ��ȡcdepcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdepcode() {
            return cdepcode;
        }

        /**
         * ����cdepcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdepcode(String value) {
            this.cdepcode = value;
        }

        /**
         * ��ȡfcreditquantity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcreditquantity() {
            return fcreditquantity;
        }

        /**
         * ����fcreditquantity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcreditquantity(String value) {
            this.fcreditquantity = value;
        }

        /**
         * ��ȡicredate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIcredate() {
            return icredate;
        }

        /**
         * ����icredate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIcredate(String value) {
            this.icredate = value;
        }

        /**
         * ��ȡccregrade���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcregrade() {
            return ccregrade;
        }

        /**
         * ����ccregrade���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcregrade(String value) {
            this.ccregrade = value;
        }

        /**
         * ��ȡdpvaliddate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDpvaliddate() {
            return dpvaliddate;
        }

        /**
         * ����dpvaliddate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDpvaliddate(String value) {
            this.dpvaliddate = value;
        }

        /**
         * ��ȡdpinvaliddate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDpinvaliddate() {
            return dpinvaliddate;
        }

        /**
         * ����dpinvaliddate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDpinvaliddate(String value) {
            this.dpinvaliddate = value;
        }

        /**
         * ��ȡrNativePlace���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNativePlace() {
            return rNativePlace;
        }

        /**
         * ����rNativePlace���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNativePlace(String value) {
            this.rNativePlace = value;
        }

        /**
         * ��ȡrNational���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNational() {
            return rNational;
        }

        /**
         * ����rNational���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNational(String value) {
            this.rNational = value;
        }

        /**
         * ��ȡrhealthStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRhealthStatus() {
            return rhealthStatus;
        }

        /**
         * ����rhealthStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRhealthStatus(String value) {
            this.rhealthStatus = value;
        }

        /**
         * ��ȡrMarriStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRMarriStatus() {
            return rMarriStatus;
        }

        /**
         * ����rMarriStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRMarriStatus(String value) {
            this.rMarriStatus = value;
        }

        /**
         * ��ȡmPicture���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMPicture() {
            return mPicture;
        }

        /**
         * ����mPicture���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMPicture(String value) {
            this.mPicture = value;
        }

        /**
         * ��ȡrPerResidence���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPerResidence() {
            return rPerResidence;
        }

        /**
         * ����rPerResidence���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPerResidence(String value) {
            this.rPerResidence = value;
        }

        /**
         * ��ȡvAliaName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVAliaName() {
            return vAliaName;
        }

        /**
         * ����vAliaName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVAliaName(String value) {
            this.vAliaName = value;
        }

        /**
         * ��ȡdJoinworkDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDJoinworkDate() {
            return dJoinworkDate;
        }

        /**
         * ����dJoinworkDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDJoinworkDate(String value) {
            this.dJoinworkDate = value;
        }

        /**
         * ��ȡdEnterDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEnterDate() {
            return dEnterDate;
        }

        /**
         * ����dEnterDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEnterDate(String value) {
            this.dEnterDate = value;
        }

        /**
         * ��ȡdRegularDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRegularDate() {
            return dRegularDate;
        }

        /**
         * ����dRegularDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRegularDate(String value) {
            this.dRegularDate = value;
        }

        /**
         * ��ȡvssNo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVSSNo() {
            return vssNo;
        }

        /**
         * ����vssNo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVSSNo(String value) {
            this.vssNo = value;
        }

        /**
         * ��ȡdEnterUnitDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEnterUnitDate() {
            return dEnterUnitDate;
        }

        /**
         * ����dEnterUnitDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEnterUnitDate(String value) {
            this.dEnterUnitDate = value;
        }

        /**
         * ��ȡbProbation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBProbation() {
            return bProbation;
        }

        /**
         * ����bProbation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBProbation(String value) {
            this.bProbation = value;
        }

        /**
         * ��ȡtablename���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTablename() {
            return tablename;
        }

        /**
         * ����tablename���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTablename(String value) {
            this.tablename = value;
        }

    }

}
