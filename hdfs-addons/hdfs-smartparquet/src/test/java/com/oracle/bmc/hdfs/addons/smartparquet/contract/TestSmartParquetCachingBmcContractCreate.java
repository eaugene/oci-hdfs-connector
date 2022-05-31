package com.oracle.bmc.hdfs.addons.smartparquet.contract;

import com.oracle.bmc.hdfs.addons.smartparquet.BmcSmartParquetCachingContract;
import com.oracle.bmc.hdfs.contract.TestBmcContractCreate;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.contract.AbstractFSContract;

public class TestSmartParquetCachingBmcContractCreate extends TestBmcContractCreate {

    @Override
    protected AbstractFSContract createContract(final Configuration conf) {
        return new BmcSmartParquetCachingContract(conf);
    }
}
