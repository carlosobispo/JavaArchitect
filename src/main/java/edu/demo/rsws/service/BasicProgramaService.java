package edu.demo.rsws.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;

import edu.demo.rsws.entity.Programa;

@Path("/programa")
public class BasicProgramaService implements ProgramaService{

	private static Map<String, Programa> programas;
	
	static{
		programas = new HashMap<String, Programa>();
		
		programas.put("01", new Programa("PR01", "Programa Demo 1"));
		programas.put("02", new Programa("PR02", "Programa Demo 2"));
		programas.put("03", new Programa("PR03", "Programa Demo 3"));
	}
	
	public List<Programa> getprogramas() {
		Collection<Programa> collProgramas = programas.values();
		List<Programa> listProgramas = new ArrayList<Programa>();
	
		for(Iterator<Programa> iterator= collProgramas.iterator();
				iterator.hasNext();){
			Programa programa = iterator.next();
            listProgramas.add(programa);
        }
        return listProgramas;
	}

}
