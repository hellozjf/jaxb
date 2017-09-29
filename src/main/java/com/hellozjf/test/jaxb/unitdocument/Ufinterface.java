//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:53 PM CST 
//


package com.hellozjf.test.jaxb.unitdocument;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="unitdocument" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cunitname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cunitsname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cclass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ccusid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="csupid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="caddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cpostcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ctelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ctelefax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cmobiletele" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cemail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="clinkman" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cremark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbankcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cpersonid" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitdocument"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Unitdocument> unitdocument;
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

    /**
     * Gets the value of the unitdocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitdocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitdocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Unitdocument }
     * 
     * 
     */
    public List<Ufinterface.Unitdocument> getUnitdocument() {
        if (unitdocument == null) {
            unitdocument = new ArrayList<Ufinterface.Unitdocument>();
        }
        return this.unitdocument;
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="cunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cunitname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cunitsname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cclass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ccusid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="csupid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="caddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cpostcode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ctelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ctelefax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbp" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cmobiletele" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cemail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="clinkman" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cremark" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbankcode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cpersonid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unitdocument {

        @XmlAttribute(name = "cunitid")
        protected String cunitid;
        @XmlAttribute(name = "cunitname")
        protected String cunitname;
        @XmlAttribute(name = "cunitsname")
        protected String cunitsname;
        @XmlAttribute(name = "cclass")
        protected String cclass;
        @XmlAttribute(name = "ccusid")
        protected String ccusid;
        @XmlAttribute(name = "csupid")
        protected String csupid;
        @XmlAttribute(name = "caddress")
        protected String caddress;
        @XmlAttribute(name = "cpostcode")
        protected String cpostcode;
        @XmlAttribute(name = "ctelephone")
        protected String ctelephone;
        @XmlAttribute(name = "ctelefax")
        protected String ctelefax;
        @XmlAttribute(name = "cbp")
        protected String cbp;
        @XmlAttribute(name = "cmobiletele")
        protected String cmobiletele;
        @XmlAttribute(name = "cemail")
        protected String cemail;
        @XmlAttribute(name = "clinkman")
        protected String clinkman;
        @XmlAttribute(name = "cremark")
        protected String cremark;
        @XmlAttribute(name = "cbankcode")
        protected String cbankcode;
        @XmlAttribute(name = "cdepid")
        protected String cdepid;
        @XmlAttribute(name = "cpersonid")
        protected String cpersonid;

        /**
         * ��ȡcunitid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitid() {
            return cunitid;
        }

        /**
         * ����cunitid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitid(String value) {
            this.cunitid = value;
        }

        /**
         * ��ȡcunitname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitname() {
            return cunitname;
        }

        /**
         * ����cunitname���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitname(String value) {
            this.cunitname = value;
        }

        /**
         * ��ȡcunitsname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitsname() {
            return cunitsname;
        }

        /**
         * ����cunitsname���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitsname(String value) {
            this.cunitsname = value;
        }

        /**
         * ��ȡcclass���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCclass() {
            return cclass;
        }

        /**
         * ����cclass���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCclass(String value) {
            this.cclass = value;
        }

        /**
         * ��ȡccusid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusid() {
            return ccusid;
        }

        /**
         * ����ccusid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusid(String value) {
            this.ccusid = value;
        }

        /**
         * ��ȡcsupid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCsupid() {
            return csupid;
        }

        /**
         * ����csupid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCsupid(String value) {
            this.csupid = value;
        }

        /**
         * ��ȡcaddress���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaddress() {
            return caddress;
        }

        /**
         * ����caddress���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaddress(String value) {
            this.caddress = value;
        }

        /**
         * ��ȡcpostcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpostcode() {
            return cpostcode;
        }

        /**
         * ����cpostcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpostcode(String value) {
            this.cpostcode = value;
        }

        /**
         * ��ȡctelephone���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtelephone() {
            return ctelephone;
        }

        /**
         * ����ctelephone���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtelephone(String value) {
            this.ctelephone = value;
        }

        /**
         * ��ȡctelefax���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtelefax() {
            return ctelefax;
        }

        /**
         * ����ctelefax���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtelefax(String value) {
            this.ctelefax = value;
        }

        /**
         * ��ȡcbp���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbp() {
            return cbp;
        }

        /**
         * ����cbp���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbp(String value) {
            this.cbp = value;
        }

        /**
         * ��ȡcmobiletele���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCmobiletele() {
            return cmobiletele;
        }

        /**
         * ����cmobiletele���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCmobiletele(String value) {
            this.cmobiletele = value;
        }

        /**
         * ��ȡcemail���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCemail() {
            return cemail;
        }

        /**
         * ����cemail���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCemail(String value) {
            this.cemail = value;
        }

        /**
         * ��ȡclinkman���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinkman() {
            return clinkman;
        }

        /**
         * ����clinkman���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinkman(String value) {
            this.clinkman = value;
        }

        /**
         * ��ȡcremark���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCremark() {
            return cremark;
        }

        /**
         * ����cremark���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCremark(String value) {
            this.cremark = value;
        }

        /**
         * ��ȡcbankcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbankcode() {
            return cbankcode;
        }

        /**
         * ����cbankcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbankcode(String value) {
            this.cbankcode = value;
        }

        /**
         * ��ȡcdepid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdepid() {
            return cdepid;
        }

        /**
         * ����cdepid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdepid(String value) {
            this.cdepid = value;
        }

        /**
         * ��ȡcpersonid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpersonid() {
            return cpersonid;
        }

        /**
         * ����cpersonid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpersonid(String value) {
            this.cpersonid = value;
        }

    }

}
