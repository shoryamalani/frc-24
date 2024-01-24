package frc.robot.subsystems.intake.pivot;

import edu.wpi.first.math.geometry.Rotation2d;
import frc.lib.advantagekit.LoggedIO;

public interface PivotIO extends LoggedIO<PivotIO.PivotIOInputs>{

    public class PivotIOInputs {
        public double curAngle;
        public double desiredAngle;
        public double curSpeed;
        public double voltage;
    }

    public void setDesiredAngle(Rotation2d angle);

    public void updateInputs(PivotIOInputs inputs);
    
}
