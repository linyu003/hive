<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class AddCheckConstraintRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'checkConstraintCols',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLCheckConstraint',
                ),
        ),
    );

    /**
     * @var \metastore\SQLCheckConstraint[]
     */
    public $checkConstraintCols = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['checkConstraintCols'])) {
                $this->checkConstraintCols = $vals['checkConstraintCols'];
            }
        }
    }

    public function getName()
    {
        return 'AddCheckConstraintRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->checkConstraintCols = array();
                        $_size461 = 0;
                        $_etype464 = 0;
                        $xfer += $input->readListBegin($_etype464, $_size461);
                        for ($_i465 = 0; $_i465 < $_size461; ++$_i465) {
                            $elem466 = null;
                            $elem466 = new \metastore\SQLCheckConstraint();
                            $xfer += $elem466->read($input);
                            $this->checkConstraintCols []= $elem466;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('AddCheckConstraintRequest');
        if ($this->checkConstraintCols !== null) {
            if (!is_array($this->checkConstraintCols)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('checkConstraintCols', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->checkConstraintCols));
            foreach ($this->checkConstraintCols as $iter467) {
                $xfer += $iter467->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
