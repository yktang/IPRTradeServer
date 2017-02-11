package com.weiwei.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.common.Constants;

@RestController
@RequestMapping(Constants.PATENTSEARCH)
public class PatentSearchController {
	Logger logger = LogManager.getLogger(PatentSearchController.class);
}
