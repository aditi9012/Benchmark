package audit.Benchmark.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import audit.Benchmark.Service.BenchmarkService;
import audit.Benchmark.entity.AuditBenchmark;

@RestController

public class BenchmarkController {
	
	@Autowired
	private BenchmarkService benchService;
	
	@GetMapping("/AuditBenchmark")
	public Map<String,Integer> getBenchmark(){
		List<AuditBenchmark> list=benchService.getAuditType();
		Map<String,Integer> map = new HashMap<String,Integer>(); 
		for (int i=0; i<list.size(); i++) {
	      map.put(list.get(i).getAuditType(), list.get(i).getBenchmarkNoAnswers()); 
	    }
		return map;
	}

}
