package audit.Benchmark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import audit.Benchmark.entity.AuditBenchmark;

public interface BenchmarkDao extends JpaRepository<AuditBenchmark, Integer> {
	
}
