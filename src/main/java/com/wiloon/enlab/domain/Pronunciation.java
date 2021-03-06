package com.wiloon.enlab.domain;

import org.apache.log4j.Logger;

public class Pronunciation {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger.getLogger(Pronunciation.class);

    private String pronunciation;

    protected String pronFormator(String pron) {
	if (logger.isDebugEnabled()) {
	    logger.debug("pronFormator(String) - start"); //$NON-NLS-1$
	}

	if (null == pron) {

	    if (logger.isDebugEnabled()) {
		logger.debug("pronFormator(String) - end"); //$NON-NLS-1$
	    }
	    return "";
	}
	pron = pron.replace("*", "");
	pron = pron.replace("[", "");
	pron = pron.replace("]", "");
	pron = pron.replace("/", "");
	pron = pron.replace("\\", "");

	if (logger.isDebugEnabled()) {
	    logger.debug("pronFormator(String) - end"); //$NON-NLS-1$
	}
	return pron;

    }

    public void setPronunciation(String pronunciation) {

	this.pronunciation = pronFormator(pronunciation);

    }

    public String getPronunciation() {

	return pronunciation;
    }
}
