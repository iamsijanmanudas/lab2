package lab2.udas.lab2;

import org.springframework.boot.CommandLineRunner;

import lab2.udas.lab2.model.Model;

public class StartUp implements CommandLineRunner {

   Model model;

@Override
public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
}

public StartUp(Model model) {
    this.model = model;
}
   
   
    
}
