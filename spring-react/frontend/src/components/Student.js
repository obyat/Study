import React, { useState, useEffect } from "react";
import { makeStyles } from "@mui/styles";
import TextField from "@mui/material/TextField";
import {
  Container,
  Paper,
  Button,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
} from "@mui/material";

const useStyles = makeStyles((theme) => ({
  root: {
    "& > ": {
      margin: theme.spacing(10),
    },
  },
}));

export default function Student() {
  const paperStyle = {
    padding: "5% 2%",
    width: 600,
    margin: "12% auto",
  };

  const [name, setName] = useState("");
  const [address, setAddress] = useState("");
  const [students, setStudents] = useState([]);
  const classes = useStyles;

  const handleClick = (event) => {
    event.preventDefault();
    const student = {
      name,
      address,
    };
    alert(student.name + "\n" + student.address);

    fetch("http://localhost:8080/student/add", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student),
    }).then(() => {
      alert("New student Added: " + student.name);
    });
  };

  useEffect(() => {
    fetch("http://localhost:8080/student")
      .then((response) => response.json())
      .then((result) => {
        setStudents(result);
      });
  });

  return (
    <Container>
      <Paper elevation={3} style={paperStyle}>
        <h1 style={{ color: "green" }}>Add Student</h1>
        <form
          className={classes.root}
          component="form"
          noValidate
          autoComplete="off"
        >
          <TextField
            id="Student Name"
            label="Student Name"
            variant="filled"
            fullWidth
            value={name}
            onChange={(event) => setName(event.target.value)}
          />
          <TextField
            id="Student Address"
            label="Student Address"
            variant="filled"
            fullWidth
            value={address}
            onChange={(event) => setAddress(event.target.value)}
          />
          <div style={{ margin: "5%" }}>
            <Button
              variant="contained"
              color="secondary"
              style={{ color: "yellow" }}
              onClick={handleClick}
            >
              Submit
            </Button>
            {/* <Paper elevation={3} style={paperStyle}> */}
            <form style={{ margin: "10%" }}>
              <Paper elevation={10} margin={2}>
                <h1 style={{ color: "orange" }}>Students</h1>
                <TableContainer component={Paper}>
                  <Table>
                    <TableHead sx={{ backgroundColor: "red" }}>
                      <TableRow>
                        <TableCell sx={{ color: "blue" }}>Id</TableCell>
                        <TableCell sx={{ color: "purple" }}>Name</TableCell>
                        <TableCell sx={{ color: "grey" }}>Address</TableCell>
                      </TableRow>
                    </TableHead>
                    <TableBody>
                      {students.map((student) => (
                        <TableRow key={student.id}>
                          <TableCell sx={{ color: "blue" }}>
                            {student.id}
                          </TableCell>
                          <TableCell sx={{ color: "purple" }}>
                            {student.name}
                          </TableCell>
                          <TableCell sx={{ color: "grey" }}>
                            {student.address}
                          </TableCell>
                        </TableRow>
                      ))}
                    </TableBody>
                  </Table>
                </TableContainer>
              </Paper>
            </form>
          </div>
        </form>
      </Paper>
    </Container>
  );
}