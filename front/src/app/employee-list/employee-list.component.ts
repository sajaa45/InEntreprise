import { Component } from '@angular/core';
import { Employee } from "../employee";


  @Component({
    selector: 'app-employee-list',
    templateUrl: './employee-list.component.html',
    styleUrls: ['./employee-list.component.css']
  })
  export class EmployeeListComponent {
    employees: Employee[]=[];
    constructor() { }
    ngOnInit(): void{
      this.employees=[
      {"id":1,"firstName":"John","lastName":"Doe","emailId":"john.doe@example.com"},
      {"id":2,"firstName":"Jane","lastName":"Smith","emailId":"jane.smith@example.com"

    }];}
  };

