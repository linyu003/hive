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

class PartitionsStatsResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'partStats',
            'isRequired' => true,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::LST,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::LST,
                'etype' => TType::STRUCT,
                'elem' => array(
                    'type' => TType::STRUCT,
                    'class' => '\metastore\ColumnStatisticsObj',
                    ),
                ),
        ),
        2 => array(
            'var' => 'isStatsCompliant',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var array
     */
    public $partStats = null;
    /**
     * @var bool
     */
    public $isStatsCompliant = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['partStats'])) {
                $this->partStats = $vals['partStats'];
            }
            if (isset($vals['isStatsCompliant'])) {
                $this->isStatsCompliant = $vals['isStatsCompliant'];
            }
        }
    }

    public function getName()
    {
        return 'PartitionsStatsResult';
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
                    if ($ftype == TType::MAP) {
                        $this->partStats = array();
                        $_size489 = 0;
                        $_ktype490 = 0;
                        $_vtype491 = 0;
                        $xfer += $input->readMapBegin($_ktype490, $_vtype491, $_size489);
                        for ($_i493 = 0; $_i493 < $_size489; ++$_i493) {
                            $key494 = '';
                            $val495 = array();
                            $xfer += $input->readString($key494);
                            $val495 = array();
                            $_size496 = 0;
                            $_etype499 = 0;
                            $xfer += $input->readListBegin($_etype499, $_size496);
                            for ($_i500 = 0; $_i500 < $_size496; ++$_i500) {
                                $elem501 = null;
                                $elem501 = new \metastore\ColumnStatisticsObj();
                                $xfer += $elem501->read($input);
                                $val495 []= $elem501;
                            }
                            $xfer += $input->readListEnd();
                            $this->partStats[$key494] = $val495;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->isStatsCompliant);
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
        $xfer += $output->writeStructBegin('PartitionsStatsResult');
        if ($this->partStats !== null) {
            if (!is_array($this->partStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partStats', TType::MAP, 1);
            $output->writeMapBegin(TType::STRING, TType::LST, count($this->partStats));
            foreach ($this->partStats as $kiter502 => $viter503) {
                $xfer += $output->writeString($kiter502);
                $output->writeListBegin(TType::STRUCT, count($viter503));
                foreach ($viter503 as $iter504) {
                    $xfer += $iter504->write($output);
                }
                $output->writeListEnd();
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->isStatsCompliant !== null) {
            $xfer += $output->writeFieldBegin('isStatsCompliant', TType::BOOL, 2);
            $xfer += $output->writeBool($this->isStatsCompliant);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
