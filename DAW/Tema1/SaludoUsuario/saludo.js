import os from "os";
import { readdir } from 'fs/promises';
const user = os.userInfo();

console.log(user.username);