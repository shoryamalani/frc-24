package frc.robot.subsystems.intake;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import frc.lib.hardwareprofiler.ProfiledSubsystem;
import frc.robot.subsystems.shooter.pivot.PivotIO;

public class Intake extends ProfiledSubsystem {
    
    PivotIO m_io;

    Rotation2d m_rotation;

    public Intake() {
        super();
        m_rotation = Rotation2d.fromDegrees(-0);
    }
 
    public Transform3d getTransform() {
        m_rotation = m_rotation.plus(Rotation2d.fromDegrees(1));
        return new Transform3d(-0.515+.287, 0, 0.233, new Rotation3d(0, m_rotation.getRadians(), 0));
        // return new Transform3d(-0, 0, 0, new Rotation3d(0, m_rotation.getRadians(), 0));
    }
}
