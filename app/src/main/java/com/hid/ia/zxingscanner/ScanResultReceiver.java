package com.hid.ia.zxingscanner;


    public interface ScanResultReceiver {

        public void scanResultData(String codeFormat, String codeContent);

        public void scanResultData(NoScanResultException noScanData);
    }

